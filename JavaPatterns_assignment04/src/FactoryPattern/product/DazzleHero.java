package FactoryPattern.product;

public class DazzleHero implements Hero{
    @Override
    public void getName() {
        System.out.println("Name : Dazzle.");
    }

    @Override
    public void getAttribute() {
        System.out.println("Attribute : intelligence.");
    }

    @Override
    public void getInitialDamage() {
        System.out.println("Initial damage : 47-53.");
    }

}
