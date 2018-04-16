package sternik.as.singleton.commands.garagegate;

import sternik.as.singleton.commands.Command;
import sternik.as.singleton.garagegate.GarageGate;

public class CommandGarageGateOpen implements Command {

    public void execute() {
        GarageGate.instance().gateOpen();
    }

    public String getDescription() {
        return "Garage open";
    }
}
