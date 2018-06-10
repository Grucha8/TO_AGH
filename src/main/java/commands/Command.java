package main.java.commands;

import java.util.Stack;

public interface Command {

    public Stack<Double> evaluate(Stack<Double> stack);
    public String getResult();

}
