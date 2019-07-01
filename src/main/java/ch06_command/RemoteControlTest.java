package ch06_command;

public class RemoteControlTest {

    public static void main(String[] args) {
        Light light = new Light("light");
        Command lightOn = new LightOnCommand(light);
        SimpleRemoteControl control = new SimpleRemoteControl();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        control.setCommand(lightOn);
        control.buttonWasPressed();

        control.setCommand(garageDoorOpen);
        control.buttonWasPressed();
    }

}
