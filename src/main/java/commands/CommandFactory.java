package main.java.commands;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Factory class for creating new main.java.commands
 *
 */
public class CommandFactory {

    public CommandFactory(){}

    /**
     * main.java.Main factory method to create a new command.
     *
     * @param name Name of command to create.
     * @return New command object.
     */
    public Command makeCommand(String name){

        switch (name){
            case "Add":
                return new Add();
            case "Sub":
                return new Sub();
            case "Get":
                return new Get();
            default:
                /* regex pattern matching */
                Pattern p = Pattern.compile("Put (\\d+([.]\\d+)*)\\s*$");
                Matcher m = p.matcher(name);
                if(m.find()){
                    return new Put(Double.parseDouble(m.group(1)));
                }

                System.out.println("Wrong command");
                return null;
        }
    }
}
