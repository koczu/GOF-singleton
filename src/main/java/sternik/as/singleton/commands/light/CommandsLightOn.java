package sternik.as.singleton.commands.light;

import sternik.as.singleton.commands.Command;
import sternik.as.singleton.light.Light;

public class CommandsLightOn implements Command {

    public void execute() {
        Light.instance().on();
    }

    public String getDescription() {
        return "Light On";
    }
}
