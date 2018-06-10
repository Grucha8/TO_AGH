package test.java.parser;

import main.java.commands.*;
import main.java.parser.Parser;
import main.java.parser.ParserException;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void parseInvalidCommandName() {
        Parser parser = new Parser("geeT");

        try {
            parser.parse();
            fail("Didn't throw on invalid command name.");
        } catch (ParserException e) {

        }
    }

    @Test
    public void parseCaseInsensitive() {
        Parser parser = new Parser("aDd");

        List<Command> commands = parser.parse();
        assertEquals(commands.size(), 1);
        assertEquals(commands.get(0).getClass(), Add.class);
    }

    @Test
    public void parsePutWithParameter() {
        Parser parser = new Parser("put 123.123");

        List<Command> commands = parser.parse();
        assertEquals(commands.size(), 1);
        assertEquals(commands.get(0).getClass(), Put.class);
    }

    @Test
    public void parseMultipleCommands() {
        Parser parser = new Parser("   put 123.123  \n\n   put    321.321\nadd \n get  ");

        List<Command> commands = parser.parse();
        assertEquals(commands.size(), 4);
        assertEquals(commands.get(0).getClass(), Put.class);
        assertEquals(commands.get(1).getClass(), Put.class);
        assertEquals(commands.get(2).getClass(), Add.class);
        assertEquals(commands.get(3).getClass(), Get.class);
    }

    @Test
    public void parseMultilineEmpty() {
        Parser parser = new Parser("  \n      \n\n\n    \n \n");

        List<Command> commands = parser.parse();
        assertEquals(commands.size(), 0);
    }

    @Test
    public void parseMultipleCommandsSameLine() {
        Parser parser = new Parser("   put 123.123    put    321.321 add  get  ");

        try {
            parser.parse();
            fail("Didn't throw on trying to parse multiple commands in the same line.");
        } catch (ParserException e) {

        }

    }
}