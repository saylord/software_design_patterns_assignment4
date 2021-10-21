package AbstractFactoryPattern.honeyCake;

import AbstractFactoryPattern.FoodColoring;

public class NoFoodColoring implements FoodColoring {
    @Override
    public void addFoodColoring() {
        System.out.println("No food coloring added...");
    }
}
