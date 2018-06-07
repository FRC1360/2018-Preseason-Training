package frc.team1360.IO;
import edu.wpi.first.wpilibj.*;


public class RobotOutput {
    //This Class is for output to the robot
    private Victor driveLeft = new Victor(0);
    private Victor driveRight = new Victor(1);

    private static final RobotOutput instance = new RobotOutput();

    public RobotOutput() {
        //Inverts the left side
        driveLeft.setInverted(true);
        driveRight.setInverted(false);
    }

    public static RobotOutput getInstance() {
        return instance;
    }

    public double deadzone(double input) {
        if(Math.abs(input) < 0.1) return 0;
        else return input;
    }

    public void setDriveLeft(double left) {
        driveLeft.set(left*0.25);
    }

    public void setDriveRight(double right) {
        driveRight.set(right*0.25);
    }
}
