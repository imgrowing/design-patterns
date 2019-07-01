package ch06_command;

public class CeilingFanLowCommand extends CeilingFanBasicCommand {
    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        super.execute();
        ceilingFan.low();
    }
}
