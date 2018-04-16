package sternik.as.singleton.commands;

import sternik.as.singleton.fan.Fan;
import sternik.as.singleton.light.Light;
import sternik.as.singleton.televisor.Televisor;

public class CommandTurnOffAll implements Command {
    @Override
    public void execute() {
        Televisor.instance().off();
        Light.instance().off();
        Fan.instance().off();
    }

    @Override
    public String getDescription() {
        return "Turn OFF TV, Fan and Light";
    }
}
