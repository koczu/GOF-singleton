package sternik.as.singleton.commands.garagegate;

import sternik.as.singleton.commands.Command;
import sternik.as.singleton.garagegate.GarageGate;

public class CommandGarageGateClose implements Command {

    public void execute() {
        GarageGate.instance().gateDown();
    }

    public String getDescription() {
        return "Garage close";
    }
}
