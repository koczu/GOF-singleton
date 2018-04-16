package sternik.as.singleton.commands;

import sternik.as.singleton.fan.Fan;
import sternik.as.singleton.light.Light;
import sternik.as.singleton.televisor.Televisor;

public class CommandLazyPersonMode implements Command {
    @Override
    public void execute() {
        Televisor.instance().on();
        Light.instance().on();
        Fan.instance().on();
        Fan.instance().stateOfRotation2();
    }

    @Override
    public String getDescription() {
        return "Turn ON TV, Fan and Light";
    }
}
