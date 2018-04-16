package sternik.as.singleton.commands;

public class CommandClose implements Command {


        public void execute() {
            System.out.println("Close pilot");
        }

        public String getDescription() {
            return "Close pilot";
        }
    }
