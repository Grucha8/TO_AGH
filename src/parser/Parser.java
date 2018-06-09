package parser;

import commands.Command;
import commands.CommandFactory;

import java.util.*;

/**
 * Parses the given string into a list of commands.
 * Each line of that string that doesn't contain only
 * whitespace characters is parsed as a command. Only
 * one command can be specified in a line. Input is NOT
 * case sensitive. Valid command specifications are:
 *  - add
 *  - sub
 *  - get
 *  - put %d (where %d is a number in format 123.456)
 */
public class Parser {
    /**
     * Map that contains command name translations from input format
     * into format taken by CommandFactory.
     *
     * @see CommandFactory
     */
    private static final Map<String, String> commandNameTranslations;

    private String stringToParse;

    static {
        commandNameTranslations = new HashMap<>();
        commandNameTranslations.put("add", "Add");
        commandNameTranslations.put("sub", "Sub");
        commandNameTranslations.put("get", "Get");
        commandNameTranslations.put("put", "Put");
    }

    /**
     * Constructs a parser that operates on a given string.
     *
     * @param str The string to parse later.
     */
    public Parser(String str) {
        this.stringToParse = str;
    }

    /**
     * Parses a string provided in the constructor into a list of commands.
     *
     * @throws ParserException if the command is unknown or has wrong parameters.
     * @return List of commands parsed from the string.
     */
    public List<Command> parse() {
        CommandFactory commandFactory = new CommandFactory();
        List<Command> commands = new ArrayList<>();

        for(String line : stringToParse.split("\\r?\\n")) {
            String parts[] = line.split("\\s+");
            if(parts.length < 1) continue;

            String commandName = parts[0].toLowerCase();
            String normalizedCommandName = commandNameTranslations.get(commandName);
            if(normalizedCommandName == null) {
                throw new ParserException(line);
            }

            parts[0] = normalizedCommandName;

            Command command = commandFactory.makeCommand(String.join(" ", parts));
            if(command == null) {
                throw new ParserException(line);
            }

            commands.add(command);
        }

        return commands;
    }
}
