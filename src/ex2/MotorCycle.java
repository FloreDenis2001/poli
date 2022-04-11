package ex2;

import java.util.ArrayList;

public class MotorCycle extends Vehicule {
    private int engineVolume;
    private int speedMotorCycle;

    public MotorCycle(int engineVolume, int speedMotorCycle, ArrayList<Roata>roti){
        super("BMW","6184123412",roti);
        this.engineVolume=engineVolume;
        this.speedMotorCycle=speedMotorCycle;
    }

    @Override
    public int viteza() {
        return this.speedMotorCycle;
    }
}
