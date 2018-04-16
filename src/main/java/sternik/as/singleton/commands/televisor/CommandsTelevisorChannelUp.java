package sternik.as.singleton.commands.televisor;

import sternik.as.singleton.commands.Command;
import sternik.as.singleton.televisor.Televisor;

public class CommandsTelevisorChannelUp implements Command {

    public void execute() {
        Televisor.instance().channelUP();
    }

    public String getDescription() {
        return "Channel UP";
    }
}
