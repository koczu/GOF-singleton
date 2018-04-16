package sternik.as.singleton.commands.light;

import sternik.as.singleton.commands.Command;
import sternik.as.singleton.light.Light;

public class CommandsLightOff implements Command {

    public void execute() {
        Light.instance().off();
    }

    public String getDescription() {
        return "Light Off";
    }
}
