package sternik.as.singleton.commands;


public interface Command {
    void execute();
    String getDescription();
}