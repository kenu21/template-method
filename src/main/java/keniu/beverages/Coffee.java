package keniu.beverages;

public class Coffee extends Beverage {
    @Override
    public void brew() {
        System.out.println("Brewing Coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding liquor");
    }
}
