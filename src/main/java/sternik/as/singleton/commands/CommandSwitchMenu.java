package sternik.as.singleton.commands;

import sternik.as.singleton.Pilot;
public class CommandSwitchMenu implements Command{


        public Pilot pilot=null;

        public CommandSwitchMenu() {
        }

        public CommandSwitchMenu(Pilot pilot) {
            this.pilot = pilot;
        }

        public void execute() {
            pilot.switchMenu();
        }

        public String getDescription() {
            return "Switch Menu";
        }
    }
