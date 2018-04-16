package sternik.as.singleton.light;


public final class Light
{
    private static Light instance = new Light();
    final LightState on = new LightOn(this);
    final LightState off = new LightOff(this);
    private LightState actualState = off;

    private Light(){
        System.out.println("Creating new item Light");
    }

    public  static Light instance(){
        return instance;
    }

    public void on(){
        actualState=actualState.on();
    }

    public void off(){
        actualState=actualState.off();
    }
}
