package frc.team1360.IO;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;

public class HumanInput {

    private static XboxController driver = new XboxController(0);

    public static double getDriveThrottleLeft() {
        return driver.getY(GenericHID.Hand.kLeft);
    }

    public static double getDriveThrottleRight() {
        return driver.getY(GenericHID.Hand.kRight);
    }
}
