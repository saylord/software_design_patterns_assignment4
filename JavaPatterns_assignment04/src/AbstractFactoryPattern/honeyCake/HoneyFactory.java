package AbstractFactoryPattern.honeyCake;

import AbstractFactoryPattern.*;

public class HoneyFactory implements CakeFactory {
    @Override
    public Dough getDough() {
        return new HoneyDough();
    }

    @Override
    public FoodColoring getFoodColoring() {
        return new NoFoodColoring();
    }

    @Override
    public Cream getCream() {
        return new СustardCream();
    }

    @Override
    public FillingCake getFillingCake() {
        return new PrunesWalnutsFillingCake();
    }
}
