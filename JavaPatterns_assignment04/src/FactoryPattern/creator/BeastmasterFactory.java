package FactoryPattern.creator;

import FactoryPattern.product.BeastmasterHero;
import FactoryPattern.product.DrowRangerHero;

public class BeastmasterFactory extends HeroFactory{
    @Override
    protected BeastmasterHero createHero() {
        return new BeastmasterHero();
    }
}
