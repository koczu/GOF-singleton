package sternik.as.singleton.commands.televisor;

import sternik.as.singleton.commands.Command;
import sternik.as.singleton.televisor.Televisor;

public class CommandsTelevisorVolumeDown implements Command {

    public void execute() {
        Televisor.instance().volumeDown();
    }

    public String getDescription() {
        return "- Volume";
    }
}
