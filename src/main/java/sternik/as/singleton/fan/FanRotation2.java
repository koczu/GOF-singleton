package sternik.as.singleton.fan;

public class FanRotation2 implements FanState {
    private Fan fan;

    FanRotation2(Fan fan)
    {
        this.fan=fan;
    }
    @Override
    public FanState on() {
        System.out.println("Nothing to do here");
        return this;
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
        System.out.println("Changing rotation to 3");
        return fan.rotation3;
    }
}
