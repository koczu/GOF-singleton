package sternik.as.singleton.commands.fan;

import sternik.as.singleton.commands.Command;
import sternik.as.singleton.fan.Fan;

public class CommandsFanRotation2 implements Command {

    public void execute() {
        Fan.instance().stateOfRotation2();
    }

    public String getDescription() {
        return "Fan rotation 2";
    }
}
