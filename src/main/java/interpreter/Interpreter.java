package main.java.interpreter;

import main.java.commands.Command;

import java.util.List;
import java.util.Stack;

public class Interpreter {

    private Stack<Double> evaluateStack = new Stack<Double>();

    /**
     * Executes each command from main.java.commands
     *
     * @param commands
     */
    public void evaluate(List<Command> commands){

        for(Command command : commands)
            evaluateStack = command.evaluate(this.evaluateStack);

    }


    /**
     *
     * @return String representation of stack
     */
    public String getOutput(){

        String result = "";

        while(!evaluateStack.empty()){
            result = result + evaluateStack.pop().toString() + "\n";
        }

        return result;
    }
}
