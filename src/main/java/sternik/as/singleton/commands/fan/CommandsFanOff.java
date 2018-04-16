package sternik.as.singleton.commands.fan;

import sternik.as.singleton.commands.Command;
import sternik.as.singleton.fan.Fan;

public class CommandsFanOff implements Command {

    public void execute() {
        Fan.instance().off();
    }

    public String getDescription() {
        return "Fan Off";
    }
}
