package sternik.as.singleton.light;

public class LightOn implements LightState{
    private Light light;

    LightOn(Light light)
    {
        this.light=light;
    }
    @Override
    public LightState on() {
        System.out.println("Nothing to do here");
        return this;
    }

    @Override
    public LightState off() {
        System.out.println("Turning off lights");
        return light.off;
    }
}
