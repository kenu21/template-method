package keniu.beverages;

public abstract class Beverage {
    public void prepareRecipe() {
        System.out.println("Preparing recipe");
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void pourInCup() {
        System.out.println("Pouring in cup");
    }
}
