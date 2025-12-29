package keniu;

import keniu.beverages.Beverage;
import keniu.beverages.Coffee;
import keniu.beverages.Tea;

public class Main {
    public static void main(String[] args) {
        Beverage[] beverages = {new Tea(), new Coffee()};

        for (Beverage beverage : beverages) {
            System.out.println(beverage.getClass().getSimpleName() + ":");
            beverage.prepareRecipe();
            System.out.println();
        }
    }
}
