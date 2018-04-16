package sternik.as.singleton.commands.televisor;

import sternik.as.singleton.commands.Command;
import sternik.as.singleton.televisor.Televisor;

public class CommandsTelevisorOff implements Command {

    public void execute() {
        Televisor.instance().off();
    }

    public String getDescription() {
        return "TV OFF";
    }
}
