package sternik.as.singleton.garagegate;

public class GateOpen implements GarageGateState {

    private GarageGate garageGate;

    GateOpen(GarageGate garageGate)
    {
        this.garageGate=garageGate;
    }

    @Override
    public GarageGateState open() {
        System.out.println("Nothing to do here");
       return this;
    }

    @Override
    public GarageGateState close() {
        System.out.println("Closing garage gate");
        return garageGate.closed;
    }
}
