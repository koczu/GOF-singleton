package sternik.as.singleton.fan;

interface FanState {

    FanState on();

    FanState off();

    FanState rotation1();

    FanState rotation2();

    FanState rotation3();
}
