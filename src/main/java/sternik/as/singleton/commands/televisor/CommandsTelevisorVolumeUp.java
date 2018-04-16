package sternik.as.singleton.commands.televisor;

import sternik.as.singleton.commands.Command;
import sternik.as.singleton.televisor.Televisor;

public class CommandsTelevisorVolumeUp implements Command {

    public void execute() {
        Televisor.instance().volumeUP();
    }

    public String getDescription() {
        return "+ Volume";
    }
}
