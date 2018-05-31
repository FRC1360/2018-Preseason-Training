package frc.team1360.Subsystems;

import frc.team1360.IO.RobotOutput;

public class Drive {
    public static void tankDrive(double left, double right) {
        RobotOutput.setDriveLeft(left);
        RobotOutput.setDriveRight(right);
    }
}
