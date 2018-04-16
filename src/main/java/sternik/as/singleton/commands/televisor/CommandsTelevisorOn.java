package sternik.as.singleton.commands.televisor;

import sternik.as.singleton.commands.Command;
import sternik.as.singleton.televisor.Televisor;

public class CommandsTelevisorOn implements Command {

    public void execute() {
        Televisor.instance().on();
    }

    public String getDescription() {
        return "TV ON";
    }
}
