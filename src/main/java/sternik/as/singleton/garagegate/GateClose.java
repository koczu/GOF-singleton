package sternik.as.singleton.garagegate;

class GateClose implements GarageGateState {
    private GarageGate garageGate;

    GateClose(GarageGate garageGate)
    {
        this.garageGate=garageGate;
    }
    @Override
    public GarageGateState open() {
        System.out.println("Opening garage gate");
       return garageGate.opened;
    }

    @Override
    public GarageGateState close() {
        System.out.println("Nothning to do here");
        return this;
    }
}
