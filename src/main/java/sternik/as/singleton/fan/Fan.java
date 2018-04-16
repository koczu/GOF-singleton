package sternik.as.singleton.fan;


public final class Fan
{
    private static Fan instance = new Fan();
      final FanState off = new FanOff(this);
      final FanState rotation1 = new FanRotation1(this);
      final FanState rotation2 = new FanRotation2(this);
      final FanState rotation3 = new FanRotation3(this);
    private FanState actualState = off;

    private Fan() {
        System.out.println("Creating Fan");
    }

    public static Fan instance() {
        return instance;
    }

    public void on() {
        actualState=actualState.on();
    }

    public void off() {
       actualState=actualState.off();
    }

    public void stateOfRotation1() {
        actualState=actualState.rotation1();
    }

    public void stateOfRotation2() {
        actualState=actualState.rotation2();
    }

    public void stateOfRotation3() {
        actualState=actualState.rotation3();
    }
}
