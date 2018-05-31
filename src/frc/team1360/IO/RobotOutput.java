package frc.team1360.IO;
import edu.wpi.first.wpilibj.*;


public class RobotOutput {
    //This Class is for output to the robot
    private static Victor driveLeft = new Victor(0);
    private static Victor driveRight = new Victor(1);

    public static void setDriveLeft(double left) {
        driveLeft.set(left);
    }

    public static void setDriveRight(double right) {
        driveRight.set(right);
    }
}
