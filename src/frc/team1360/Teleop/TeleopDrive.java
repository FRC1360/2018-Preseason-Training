package frc.team1360.Teleop;

import frc.team1360.IO.HumanInput;
import frc.team1360.Subsystems.Drive;

public class TeleopDrive implements TeleopComponent {
    @Override
    public void update() {
        Drive.tankDrive(HumanInput.getDriveThrottleLeft(), HumanInput.getDriveThrottleRight());
    }

    @Override
    public void disable() {
        Drive.tankDrive(0, 0);
    }
}
