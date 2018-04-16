package sternik.as.singleton.commands;

public class CommandMacro implements Command{
    private final Command[] commands;

    public CommandMacro(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    public String getDescription() {
        StringBuilder opis = new StringBuilder("Macro:");
        for (int i = 0; i < commands.length; i++) {
            opis.append(commands[i].getDescription());
        }
        return opis.toString();
    }
}
