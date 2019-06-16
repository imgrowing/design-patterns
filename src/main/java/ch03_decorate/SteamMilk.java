package ch03_decorate;

public class SteamMilk extends CondimentDecorator {

    private Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 스팀 밀크";
    }
}
