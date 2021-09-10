/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MecanumDriveSubsystem extends SubsystemBase {
  private final SpeedController frontLeft = new CANSparkMax(Constants.SPARK_MAX_CAN.FRONT_LEFT_CAN_ID, MotorType.kBrushless);
  private final SpeedController frontRight = new CANSparkMax(Constants.SPARK_MAX_CAN.FRONT_RIGHT_CAN_ID, MotorType.kBrushless);
  private final SpeedController rearLeft = new CANSparkMax(Constants.SPARK_MAX_CAN.REAR_LEFT_CAN_ID, MotorType.kBrushless);
  private final SpeedController rearRight = new CANSparkMax(Constants.SPARK_MAX_CAN.REAR_RIGHT_CAN_ID, MotorType.kBrushless);
  private final MecanumDrive drive = new MecanumDrive(frontLeft, rearLeft, frontRight, rearRight); 

  /**
   * Creates a new MecanumDrive.
   */
  public MecanumDriveSubsystem() {

  }

  public void drive(double forward, double right, double clockwise) {
    double forwardScale = SmartDashboard.getNumber("Forward Reduce", 0.75);
    double rightScale = SmartDashboard.getNumber("Right Reduce", 0.75);
    double rotateScale = SmartDashboard.getNumber("Rotate Reduce", 0.5);
    double scaledRight = rightScale*Math.pow(right, 3);
    double scaledForward = forwardScale*Math.pow(forward, 3);
    double scaledClockwise = rotateScale * clockwise;

    drive.driveCartesian(scaledRight, scaledForward, scaledClockwise);

    SmartDashboard.putNumber("Scaled right", scaledRight);
    SmartDashboard.putNumber("Scaled forward", scaledForward);
    SmartDashboard.putNumber("Scaled clockwise", scaledClockwise);

    SmartDashboard.putNumber("frontLeft", frontLeft.get());
    SmartDashboard.putNumber("frontRight", frontRight.get());
    SmartDashboard.putNumber("rearLeft", rearLeft.get());
    SmartDashboard.putNumber("rearRight", rearRight.get());
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
