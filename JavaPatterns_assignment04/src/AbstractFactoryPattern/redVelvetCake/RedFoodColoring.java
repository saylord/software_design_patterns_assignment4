package AbstractFactoryPattern.redVelvetCake;

import AbstractFactoryPattern.FoodColoring;

public class RedFoodColoring implements FoodColoring {
    @Override
    public void addFoodColoring() {
        System.out.println("Adding Red food coloring...");
    }
}
