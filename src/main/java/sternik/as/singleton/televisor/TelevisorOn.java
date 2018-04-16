package sternik.as.singleton.televisor;

public class TelevisorOn implements TelevisorState {

    private Televisor televisor;

    public TelevisorOn(Televisor televisor) {
        this.televisor = televisor;
    }

    @Override
    public TelevisorState off() {
        System.out.println("Turning off tv");
        return televisor.off;

    }

    @Override
    public TelevisorState on() {
        System.out.println("Do nothing");
        return this;
    }
}
