package commands;

import java.util.EmptyStackException;
import java.util.Stack;

public class Add implements Command {

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

        stack.push(a+b);

        return stack;
    }

    @Override
    public String getResult() {
        //todo
        return null;
    }
}
