package ch06_command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GarageDoorOpenCommand implements Command {
    GarageDoor slot;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        slot = garageDoor;
    }

    @Override
    public void execute() {
        slot.lightOn();
        slot.up();
        slot.stop();
        log.info("Garage Door is Open");
    }

    @Override
    public void undo() {
    }
}
