package AbstractFactoryPattern.redVelvetCake;

import AbstractFactoryPattern.Dough;

public class BiscuitDough implements Dough {
    @Override
    public void addDough() {
        System.out.println("Doing Biscuit dough...");
    }
}
