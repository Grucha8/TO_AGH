package commands;

import java.util.EmptyStackException;
import java.util.Stack;

public class Get implements Command {

    @Override
    public Stack<Double> evaluate(Stack<Double> stack) {

        return stack;
    }

    @Override
    public String getResult() {
        //todo
        return null;
    }
}
