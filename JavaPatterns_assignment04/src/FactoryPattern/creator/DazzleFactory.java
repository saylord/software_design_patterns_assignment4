package FactoryPattern.creator;

import FactoryPattern.product.BeastmasterHero;
import FactoryPattern.product.DazzleHero;

public class DazzleFactory extends HeroFactory{
    @Override
    protected DazzleHero createHero() {
        return new DazzleHero();
    }
}
