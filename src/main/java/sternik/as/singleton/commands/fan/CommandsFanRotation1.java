package sternik.as.singleton.commands.fan;

import sternik.as.singleton.commands.Command;
import sternik.as.singleton.fan.Fan;

public class CommandsFanRotation1 implements Command {

    public void execute() {
        Fan.instance().stateOfRotation1();
    }

    public String getDescription() {
        return "Fan rotation 1";
    }
}
