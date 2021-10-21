package AbstractFactoryPattern.redVelvetCake;

import AbstractFactoryPattern.FillingCake;

public class RaspberryFillingCake implements FillingCake {
    @Override
    public void addFillingCake() {
        System.out.println("Adding Raspberry filling cake...");
    }
}
