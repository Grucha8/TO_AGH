import commands.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CommandFactory {

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
                Pattern p = Pattern.compile("Put (\\d+([.]\\d+)*)$");
                Matcher m = p.matcher(name);
                if(m.find()){
                    return new Put(Double.parseDouble(m.group(1)));
                }

                System.out.println("Wrong command");
                return null;
        }
    }
}
