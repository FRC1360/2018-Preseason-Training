package frc.team1360.Teleop;

public class TeleopControl {

    private static TeleopComponent[] components = new TeleopComponent[] {
            new TeleopDrive()
    };

    public static void runCycle() {
        for (TeleopComponent component : components) {
            component.update();
        }
    }

    public static void disable() {
        for (TeleopComponent component : components) {
            component.disable();
        }
    }

}
