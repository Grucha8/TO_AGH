package commands;

import java.util.EmptyStackException;
import java.util.Stack;

public class Sub implements Command {

    private String Result = null;

    public Sub(){}

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
            System.out.println("Empty stack cannot get value");
            stack.push(a);
            return stack;
        }

        this.Result = stack.push(a-b).toString();

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
