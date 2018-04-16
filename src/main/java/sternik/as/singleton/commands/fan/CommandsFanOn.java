package sternik.as.singleton.commands.fan;

import sternik.as.singleton.commands.Command;
import sternik.as.singleton.fan.Fan;

public class CommandsFanOn implements Command {

    public void execute() {
        Fan.instance().on();
    }

    public String getDescription() {
        return "Fan On";
    }
}
