package commands;

import java.util.EmptyStackException;
import java.util.Stack;

public class Get implements Command {

    private String Result = null;

    public Get(){}

    @Override
    public Stack<Double> evaluate(Stack<Double> stack) {
        this.Result = stack.toString();

        return stack;
    }

    @Override
    public String getResult() {

        if (this.Result == null)
            return null;
        else
            return this.Result;
    }
}
