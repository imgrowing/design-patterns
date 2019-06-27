package ch06_command;

public class LightOnClass implements Command {
    private Light light;

    public LightOnClass(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
