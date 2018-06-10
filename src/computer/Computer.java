package computer;

import commands.Command;
import interpreter.Interpreter;
import parser.Parser;

import java.util.List;


public class Computer {

    private Interpreter lastInterpreter = null;

    /**
     * Parses String representation of commands into List of commands objects
     *
     * @param input String representation of commands
     * @return List of commands objects
     */
    private List<Command> getCommandsFromString(String input){
        Parser newParser = new Parser(input);
        return newParser.parse();
    }


    /**
     * Execute commands from given List of commands objects
     *
     * @param commands List of commands
     */
    private void interpretCommands(List<Command>commands){
        Interpreter newInterpreter = new Interpreter();
        lastInterpreter = newInterpreter;
        newInterpreter.evaluate(commands);
    }


    /**
     * Execute commands from given String
     *
     * @param input String representation of commands to execute
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
