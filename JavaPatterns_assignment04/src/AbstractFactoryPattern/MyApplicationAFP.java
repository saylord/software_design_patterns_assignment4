package AbstractFactoryPattern;

import AbstractFactoryPattern.honeyCake.HoneyFactory;
import AbstractFactoryPattern.redVelvetCake.RedVelvetFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplicationAFP {
    private Scanner sc = new Scanner(System.in);

    public void start() {

        while(true) {

            System.out.println("You can choose one of the given 2 cakes:");
            System.out.println("1. Red Velvet.");
            System.out.println("2. Honey Cake.");
            System.out.println("0. Exit.");
            System.out.println();

            try {
                System.out.println("Enter option (1-2): ");
                int option = sc.nextInt();
                if (option == 1) {
                    getRedVelvetCake();
                } else if (option == 2) {
                    getHoneyCake();
                } else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Input must be integer!!!");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("=======================================");
        }
    }

    public void getRedVelvetCake() {

        CakeFactory cakeFactory = new RedVelvetFactory();
        Dough dough = cakeFactory.getDough();
        FoodColoring foodColoring = cakeFactory.getFoodColoring();
        Cream cream = cakeFactory.getCream();
        FillingCake fillingCake = cakeFactory.getFillingCake();

        System.out.println("Creating Red Velvet!!!");
        dough.addDough();
        foodColoring.addFoodColoring();
        cream.addCream();
        fillingCake.addFillingCake();
        System.out.println("Red Velvet is done!! Bon Appetite ;)");

    }

    public void getHoneyCake() {

        CakeFactory cakeFactory2 = new HoneyFactory();
        Dough dough2 = cakeFactory2.getDough();
        FoodColoring foodColoring2 = cakeFactory2.getFoodColoring();
        Cream cream2 = cakeFactory2.getCream();
        FillingCake fillingCake2 = cakeFactory2.getFillingCake();

        System.out.println("Creating Honey Cake!!!");
        dough2.addDough();
        foodColoring2.addFoodColoring();
        cream2.addCream();
        fillingCake2.addFillingCake();
        System.out.println("Honey Cake is done!! Bon Appetite ;)");

    }

}
