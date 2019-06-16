package ch03_decorate;

public abstract class Beverage {

    String description = "제목 없음";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
