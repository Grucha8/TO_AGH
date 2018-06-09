package commands;

import java.util.Stack;

public class Put implements Command {
    public Double Value;

    public Put(Double Value){
        this.Value = Value;
    }

    @Override
    public Stack<Double> evaluate(Stack<Double> stack) {
        stack.push(Value);

        return stack;
    }

    @Override
    public String getResult() {
        //todo
        return null;
    }
}
