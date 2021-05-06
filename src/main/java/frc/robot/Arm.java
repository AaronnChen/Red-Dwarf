package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystems;

public class ArmSubsystem extends Subsystem {

    private VictorSP arm_motor;
    private DigitalInput upLimitSwitch;

    public ArmSubsystem() {
        super();
        self.arm_motor = wpilib.VictorSP(3);
        DigitalInput self.upLimitSwitch = new DigitalInput(0);
    }

    public void runArm(double speed) {
        arm_motor.setSpeed(speed);
    }

    public boolean isLimitSwitchClosed() {
        return self.upLimitSwitch.get();
    }

    public void initDefaultCommand() {

    }
}