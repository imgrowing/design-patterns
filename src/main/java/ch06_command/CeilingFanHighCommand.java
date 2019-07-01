package ch06_command;

public class CeilingFanHighCommand extends CeilingFanBasicCommand {
    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        super.execute();
        ceilingFan.high();
    }
}
