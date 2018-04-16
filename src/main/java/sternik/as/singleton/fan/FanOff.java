package sternik.as.singleton.fan;

public class FanOff implements FanState {

    private Fan fan;

    public FanOff(Fan fan)
    {
        System.out.println("Nothing to do here");
        this.fan=fan;
    }
    @Override
    public FanState on() {
        System.out.println("Rotation changed to 1");
        return fan.rotation1;
    }

    @Override
    public FanState off() {
        System.out.println("Nothing to do here");
        return this;
    }

    @Override
    public FanState rotation1() {
        System.out.println("Changing rotation to 1");
        return fan.rotation1;
    }

    @Override
    public FanState rotation2() {
        System.out.println("Nothing to do here");
        return this;
    }

    @Override
    public FanState rotation3() {
        System.out.println("Nothing to do here");
        return this;
    }
}
