package ch06_command;

public class RemoteControlTest {

    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnClass(light);
        SimpleRemoteControl control = new SimpleRemoteControl();

        control.setCommand(lightOn);
        control.buttonWasPressed();
    }

}
