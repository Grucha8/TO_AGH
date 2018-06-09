package commands;

import java.util.EmptyStackException;
import java.util.Stack;

public class Sub implements Command {
    @Override
    public Stack<Double> evaluate(Stack<Double> stack) {
        Double a, b;
        try {
            a = stack.pop();
            b = stack.pop();

            stack.push(a-b);
        } catch (EmptyStackException e){
            System.out.println("Empty stack cannot get value");
        }

        return stack;
    }

    @Override
    public String getResult() {
        return 
    }
}
