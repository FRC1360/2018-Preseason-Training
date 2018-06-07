package frc.team1360.Teleop;
import frc.team1360.IO.HumanInput;
import frc.team1360.IO.RobotOutput;
import frc.team1360.Robot;
import frc.team1360.Subsystems.Drive;

public class TeleopDrive implements TeleopComponent {

    private static RobotOutput robotOutput = RobotOutput.getInstance();

    @Override
    public void update() {
        Drive.tankDrive(robotOutput.deadzone(HumanInput.getDriveThrottleLeft()), robotOutput.deadzone(HumanInput.getDriveThrottleRight()));
    }

    @Override
    public void disable() {
        Drive.tankDrive(0, 0);
    }
}
