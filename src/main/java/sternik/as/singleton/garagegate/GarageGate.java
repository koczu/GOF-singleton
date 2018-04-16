package sternik.as.singleton.garagegate;

/**
 * Hello world!
 *
 */
public final class GarageGate {
    private static GarageGate instance = new GarageGate();
    final GarageGateState opened = new GateOpen(this);
    final GarageGateState closed = new GateClose(this);
    private GarageGateState actualState = closed;

    private GarageGate() {
        System.out.println("Creating garage");
    }

    public static GarageGate instance()
    {
        return instance;
    }

    public void gateOpen() {
        actualState=actualState.open();
    }

    public void gateDown() {
       actualState= actualState.close();
    }
}