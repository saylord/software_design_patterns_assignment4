package FactoryPattern.creator;

import FactoryPattern.product.BeastmasterHero;
import FactoryPattern.product.DazzleHero;
import FactoryPattern.product.DrowRangerHero;
import FactoryPattern.product.Hero;

public abstract class HeroFactory {

    public Hero getHero() {
        Hero hero = createHero();

        hero.getName();
        hero.getAttribute();
        hero.getInitialDamage();

        return hero;
    }

    protected abstract Hero createHero();
}
