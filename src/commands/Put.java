package commands;

import java.util.Stack;

/**
 * Class for simulating a Put function in a stack.
 *
 */
public class Put implements Command {

    public Double Value;
    private String Result = null;

    public Put(Double Value){
        this.Value = Value;
    }

    /**
     * Evaluating the put function on param stack,
     * and returning updated stack.
     *
     * @param stack Stack on which we want to do an operation.
     * @return Updated stack with the result of operation
     */
    @Override
    public Stack<Double> evaluate(Stack<Double> stack) {

        stack.push(Value);

        this.Result = stack.toString();

        return stack;
    }

    /**
     * Returning number which was putted into stack
     * via this object as a string.
     *
     * @return null if object wasn't evaluated else number putted into stack
     * as string.
     */
    @Override
    public String getResult() {

        if (this.Result == null)
            return null;
        else
            return this.Result;
    }
}
