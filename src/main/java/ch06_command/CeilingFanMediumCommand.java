package ch06_command;

public class CeilingFanMediumCommand extends CeilingFanBasicCommand {
    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        super.execute();
        ceilingFan.medium();
    }
}
