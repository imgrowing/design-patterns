package ch06_command;

public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoolLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoolLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoolLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        System.out.println("=========================");

        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }

}
