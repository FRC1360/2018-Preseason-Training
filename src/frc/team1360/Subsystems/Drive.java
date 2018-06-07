package frc.team1360.Subsystems;

import frc.team1360.IO.RobotOutput;

public class Drive {
    private static RobotOutput robotOutput = RobotOutput.getInstance();

    public static void tankDrive(double left, double right) {
        robotOutput.setDriveLeft(left);
        robotOutput.setDriveRight(right);
    }
}
