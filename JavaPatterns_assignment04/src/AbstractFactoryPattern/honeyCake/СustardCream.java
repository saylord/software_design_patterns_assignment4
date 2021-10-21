package AbstractFactoryPattern.honeyCake;

import AbstractFactoryPattern.Cream;

public class СustardCream implements Cream {
    @Override
    public void addCream() {
        System.out.println("Doing Custard cream...");
    }
}
