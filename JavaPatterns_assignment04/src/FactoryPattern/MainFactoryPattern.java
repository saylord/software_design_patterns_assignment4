package FactoryPattern;

import FactoryPattern.creator.BeastmasterFactory;
import FactoryPattern.creator.DazzleFactory;
import FactoryPattern.creator.DrowRangerFactory;
import FactoryPattern.creator.HeroFactory;
import FactoryPattern.product.Hero;

public class MainFactoryPattern {

    public static void main(String[] args) {
        printHero(new DrowRangerFactory());
        System.out.println();
        System.out.println("================================");
        System.out.println();
        printHero(new BeastmasterFactory());
        System.out.println();
        System.out.println("================================");
        System.out.println();
        printHero(new DazzleFactory());
        System.out.println();
        System.out.println("================================");
        System.out.println();
    }

    public static void printHero(HeroFactory heroFactory) {
        Hero hero = heroFactory.getHero();
        System.out.println(hero);
    }
}
