package sternik.as.singleton.light;

public class LightOff implements LightState {
    private Light light;

    LightOff(Light light)
    {
        this.light=light;
    }
    @Override
    public LightState on() {
        System.out.println("Turning on lights");
        return light.on;
    }

    @Override
    public LightState off() {
        System.out.println("Nothing to do here");
        return this;
    }
}

