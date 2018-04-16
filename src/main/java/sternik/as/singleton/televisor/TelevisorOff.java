package sternik.as.singleton.televisor;

public class TelevisorOff implements TelevisorState {

    private Televisor televisor;

    public TelevisorOff(Televisor televisor) {
        this.televisor = televisor;
    }

    @Override
    public TelevisorState off() {
        System.out.println("Do nothing");
        return this;
    }

    @Override
    public TelevisorState on() {
        System.out.println("Turning on and setting channel to 1");
        return televisor.on;
    }
}
