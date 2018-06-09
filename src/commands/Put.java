package commands;

import java.util.Stack;

public class Put implements Command {

    public Double Value;
    private String Result = null;

    public Put(Double Value){
        this.Value = Value;
    }

    @Override
    public Stack<Double> evaluate(Stack<Double> stack) {

        stack.push(Value);

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
