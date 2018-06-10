package main.java.computer;

import main.java.commands.Command;
import main.java.interpreter.Interpreter;
import main.java.parser.Parser;

import java.util.List;


public class Computer {

    private Interpreter lastInterpreter = null;

    /**
     * Parses String representation of main.java.commands into List of main.java.commands objects
     *
     * @param input String representation of main.java.commands
     * @return List of main.java.commands objects
     */
    private List<Command> getCommandsFromString(String input){
        Parser newParser = new Parser(input);
        return newParser.parse();
    }


    /**
     * Execute main.java.commands from given List of main.java.commands objects
     *
     * @param commands List of main.java.commands
     */
    private void interpretCommands(List<Command>commands){
        Interpreter newInterpreter = new Interpreter();
        lastInterpreter = newInterpreter;
        newInterpreter.evaluate(commands);
    }


    /**
     * Execute main.java.commands from given String
     *
     * @param input String representation of main.java.commands to execute
     */
    public void run(String input){

        List<Command> commands = getCommandsFromString(input);
        interpretCommands(commands);

    }


    /**
     * Returns a string representation of stack of last created Interpreter
     *
     * @throws getOutputException if there has not been any Interpreter yet
     * @return String representation of stack of last Interpreter
     */
    public String getOutput(){
        if(lastInterpreter == null){
            throw new getOutputException();
        }

        return lastInterpreter.getOutput();
    }

}
