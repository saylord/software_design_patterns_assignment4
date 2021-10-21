package FactoryPattern.product;

public class DrowRangerHero implements Hero{

    @Override
    public void getName() {
        System.out.println("Name : Drow Ranger.");
    }

    @Override
    public void getAttribute() {
        System.out.println("Attribute : agility.");
    }

    @Override
    public void getInitialDamage() {
        System.out.println("Initial damage : 49-56.");
    }
}
