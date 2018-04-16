package sternik.as.singleton.commands.televisor;

import sternik.as.singleton.commands.Command;
import sternik.as.singleton.televisor.Televisor;

public class CommandsTelevisorChannelDown implements Command {

    public void execute() {
        Televisor.instance().channelDown();
    }

    public String getDescription() {
        return "Channel down";
    }
}
