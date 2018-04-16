package sternik.as.singleton.commands;

public class CommandEmpty implements Command {

    public void execute() {
    }

    public String getDescription() {
        return "Empty";
    }
}