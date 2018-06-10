package main.java.commands;

import java.util.EmptyStackException;
import java.util.Stack;

public class Sub implements Command {

    private String Result = null;

    public Sub(){}

    /**
     * Subtraction of the top two elements.
     *
     * @param stack Stack from which we are getting elements.
     * @return Updated stack with result of subtraction.
     */
    @Override
    public Stack<Double> evaluate(Stack<Double> stack) {
        Double a, b;
        try {
            a = stack.pop();
        } catch (EmptyStackException e){
            System.out.println("Empty stack cannot get value");
            return stack;
        }

        try {
            b = stack.pop();
        } catch (EmptyStackException e){
            System.out.println("No second element, cannot evaluate subtraction");
            stack.push(a);
            return stack;
        }

        this.Result = stack.push(a-b).toString();

        return stack;
    }

    /**
     * Returning result of the subtraction as a string.
     *
     * @return Result of subtraction.
     */
    @Override
    public String getResult() {
        if (this.Result == null)
            return null;
        else
            return this.Result;
    }
}
