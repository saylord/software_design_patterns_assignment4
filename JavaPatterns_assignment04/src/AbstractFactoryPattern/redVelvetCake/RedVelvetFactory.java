package AbstractFactoryPattern.redVelvetCake;

import AbstractFactoryPattern.*;

public class RedVelvetFactory implements CakeFactory {
    @Override
    public Dough getDough() {
        return new BiscuitDough();
    }

    @Override
    public FoodColoring getFoodColoring() {
        return new RedFoodColoring();
    }

    @Override
    public Cream getCream() {
        return new ButterCream();
    }

    @Override
    public FillingCake getFillingCake() {
        return new RaspberryFillingCake();
    }
}
