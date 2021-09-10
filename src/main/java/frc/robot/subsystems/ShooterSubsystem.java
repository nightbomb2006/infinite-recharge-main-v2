/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase {
  private final SpeedControllerGroup pew;
  private final Servo shooterHoodServo = new Servo(Constants.PWM.SHOOTER_HOOD_SERVO);
  

  /**
   * Creates a new ShooterSubsystem.
   */
  public ShooterSubsystem() {
    WPI_TalonFX pewLeft = new WPI_TalonFX(Constants.FALCON.PEW_LEFT_CAN_ID);
    WPI_TalonFX pewRight = new WPI_TalonFX(Constants.FALCON.PEW_RIGHT_CAN_ID);
    WPI_TalonFX pewFrontLeft = new WPI_TalonFX(Constants.FALCON.PEW_FRONT_LEFT_CAN_ID);
    WPI_TalonFX pewFrontRight = new WPI_TalonFX(Constants.FALCON.PEW_FRONT_RIGHT_CAN_ID);
    pewLeft.setInverted(true);

    pew = new SpeedControllerGroup(pewLeft, pewRight, pewFrontLeft, pewFrontRight);
  }

  public void setAngle(double degrees) {
    shooterHoodServo.setAngle(degrees);
  }

  public void shooter(boolean on, boolean up) {
    if (on) {
      // What to do when the conveyer is ON?
      if (up) {
        pew.set(0.15);
          } else {
            pew.set(-0.15);
          }
    } else {
      // What to do when the conveyer is OFF?
      pew.set(0);
    }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
