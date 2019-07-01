package ch06_command;

public class CeilingFanOffCommand extends CeilingFanBasicCommand {
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        super.execute();
        ceilingFan.off();
    }
}
