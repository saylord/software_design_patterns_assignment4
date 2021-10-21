package AbstractFactoryPattern.honeyCake;

import AbstractFactoryPattern.Dough;

public class HoneyDough implements Dough {
    @Override
    public void addDough() {
        System.out.println("Doing Honey dough...");
    }
}
