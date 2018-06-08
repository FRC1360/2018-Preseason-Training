package frc.team1360.Subsystems;

import frc.team1360.IO.RobotOutput;

public class Drive {
    private static RobotOutput robotOutput = RobotOutput.getInstance();

    public static void tankDrive(double left, double right) {
        robotOutput.setDriveLeft(left);
        robotOutput.setDriveRight(right);
    }

    public static void arcadeDrive(double throttle, double turn){
        robotOutput.setDriveLeft(throttle-turn);
        robotOutput.setDriveRight(throttle+turn);
    }
}
