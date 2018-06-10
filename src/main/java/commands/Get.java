package main.java.commands;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Class for simulating a Get option in stack
 *
 */
public class Get implements Command {

    private String Result = null;

    public Get(){}

    /**
     * Getting the first number of the stack.
     *
     * @param stack Stack form which we are getting number.
     * @return Stack without the top element.
     */
    @Override
    public Stack<Double> evaluate(Stack<Double> stack) {

        try {
            this.Result = stack.pop().toString();
        } catch (EmptyStackException e) {
            System.out.println("Empty stack.");
        }

        return stack;
    }

    /**
     * Returning number which was on top of the stack.
     *
     * @return Full stack as a string
     */
    @Override
    public String getResult() {

        if (this.Result == null)
            return null;
        else
            return this.Result;
    }
}
