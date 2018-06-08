package frc.team1360.Teleop;

import frc.team1360.IO.HumanInput;
import frc.team1360.IO.RobotOutput;
import frc.team1360.Robot;
import frc.team1360.Subsystems.Drive;

public class TeleopDrive implements TeleopComponent {

    private static RobotOutput robotOutput = RobotOutput.getInstance();

    @Override
    public void update() {
        Drive.arcadeDrive(robotOutput.deadzone(HumanInput.getTriggerThrottle()), robotOutput.deadzone(HumanInput.getTurn()));
    }

    @Override
    public void disable() {
        Drive.tankDrive(0, 0);
    }
}
