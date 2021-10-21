package AbstractFactoryPattern;

public interface CakeFactory {
    Dough getDough();
    FoodColoring getFoodColoring();
    Cream getCream();
    FillingCake getFillingCake();
}
