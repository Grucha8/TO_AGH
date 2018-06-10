package main.java.commands;

import java.util.EmptyStackException;
import java.util.Stack;

public class Add implements Command {

    private String Result = null;

    public Add(){}

    /**
     * Addition of the top two elements.
     *
     * @param stack Stack from which we are getting elements.
     * @return Updated stack with the result of addition.
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
            System.out.println("No second element, cannot evaluate addition");
            stack.push(a);
            return stack;
        }

        this.Result = stack.push(a+b).toString();

        return stack;
    }

    /**
     * Returning result of addition as a string.
     *
     * @return Result of addition.
     */
    @Override
    public String getResult() {

        if (this.Result == null)
            return null;
        else
            return this.Result;
    }
}
