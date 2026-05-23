package frc.robot.subsystems;

import java.io.Serial;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {

    public static ArmSubsystem instance;
    private final SerialPort serial;

    public ArmSubsystem() {
        serial = new SerialPort(10000, null);
    }

    public static ArmSubsystem getInstance() {
        if (instance == null) {
            instance = new ArmSubsystem();
        }
        return instance;
    }
}
