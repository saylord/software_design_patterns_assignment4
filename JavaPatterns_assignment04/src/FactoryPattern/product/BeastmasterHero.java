package FactoryPattern.product;

public class BeastmasterHero implements Hero{

    @Override
    public void getName() {
        System.out.println("Name : Beastmaster.");
    }

    @Override
    public void getAttribute() {
        System.out.println("Attribute : strength.");
    }

    @Override
    public void getInitialDamage() {
        System.out.println("Initial damage : 56-60.");
    }
}
