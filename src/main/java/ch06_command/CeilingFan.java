package ch06_command;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        System.out.println("HIGH speed");
        speed = HIGH;
    }

    public void medium() {
        System.out.println("MEDIUM speed");
        speed = MEDIUM;
    }

    public void low() {
        System.out.println("LOW speed");
        speed = LOW;
    }

    public void off() {
        System.out.println("OFF speed");
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
