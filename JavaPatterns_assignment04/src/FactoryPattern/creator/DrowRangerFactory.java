package FactoryPattern.creator;

import FactoryPattern.product.DrowRangerHero;

public class DrowRangerFactory extends HeroFactory{
    @Override
    protected DrowRangerHero createHero() {
        return new DrowRangerHero();
    }
}
