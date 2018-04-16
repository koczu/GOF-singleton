package sternik.as.singleton.fan;

public class FanRotation1 implements FanState{
    private Fan fan;

    FanRotation1(Fan fan)
    {
      this.fan=fan;
    }

    @Override
    public FanState on() {
        System.out.println("Turning on fan");
        return this;
    }

    @Override
    public FanState off() {
        System.out.println("Turning off fan");
        return fan.off;
    }

    @Override
    public FanState rotation1() {

        System.out.println("Nothing to do here");
        return this;
    }

    @Override
    public FanState rotation2() {
        System.out.println("Changing rotation to 2");
        return fan.rotation2;
    }

    @Override
    public FanState rotation3() {
        System.out.println("Nothing to do here");
        return this;
    }
}
