package sternik.as.singleton.televisor;


public final class Televisor
{
    private static Televisor instance = new Televisor();
      final TelevisorState on= new TelevisorOn(this);
     final TelevisorState off = new TelevisorOff(this);
    private TelevisorState actualState = off;

    private Televisor() {
        System.out.println("Creating televisor");
    }

    public static Televisor instance() {
        return instance;
    }

    public void on() {
        actualState= actualState.on();
    }

    public void off() {
        actualState.off();
    }

    public void channelUP() {
        System.out.println("next channel");
    }

    public void channelDown() {
        System.out.println("previous channel");
    }

    public void volumeUP() {
        System.out.println("louder");
    }

    public void volumeDown() {
        System.out.println("quieter");
    }
}

