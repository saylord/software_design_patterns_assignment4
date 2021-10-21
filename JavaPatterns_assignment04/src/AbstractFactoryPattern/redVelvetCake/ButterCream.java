package AbstractFactoryPattern.redVelvetCake;

import AbstractFactoryPattern.Cream;

public class ButterCream implements Cream {
    @Override
    public void addCream() {
        System.out.println("Doing Butter cream...");
    }
}
