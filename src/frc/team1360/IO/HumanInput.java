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

    public static double getTriggerThrottle() {
        return driver.getTriggerAxis(GenericHID.Hand.kRight) - driver.getTriggerAxis(GenericHID.Hand.kLeft);
    }

    public static double getTurn() {
        return driver.getX(GenericHID.Hand.kLeft);
    }
}
