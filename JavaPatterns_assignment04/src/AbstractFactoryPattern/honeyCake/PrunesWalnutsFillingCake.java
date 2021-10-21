package AbstractFactoryPattern.honeyCake;

import AbstractFactoryPattern.FillingCake;

public class PrunesWalnutsFillingCake implements FillingCake {
    @Override
    public void addFillingCake() {
        System.out.println("Adding Prunes and Walnuts filling cake...");
    }
}
