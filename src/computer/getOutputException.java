package computer;

public class getOutputException extends RuntimeException{
    public getOutputException(){
        super("There has not been any Interpreter yet\n");
    }
}
