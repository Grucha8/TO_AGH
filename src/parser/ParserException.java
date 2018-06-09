package parser;

public class ParserException extends RuntimeException {
    public ParserException(String line) {
        super("Cannot parse command " + line);
    }
}
