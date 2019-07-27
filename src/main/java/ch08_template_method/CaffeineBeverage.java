package ch08_template_method;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }

    abstract void brew();

    private void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    abstract void addCondiments();
}
