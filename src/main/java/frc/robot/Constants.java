/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class SPARK_MAX_CAN {
        public static final int FRONT_LEFT_CAN_ID = 5;
        public static final int FRONT_RIGHT_CAN_ID = 6;
        public static final int REAR_LEFT_CAN_ID = 3;
        public static final int REAR_RIGHT_CAN_ID = 4;
        }

    public static final class FALCON {
        public static final int INTAKE_CAN_ID = 7;
        public static final int PEW_LEFT_CAN_ID = 1; 
        public static final int PEW_RIGHT_CAN_ID = 0;
        public static final int PEW_FRONT_RIGHT_CAN_ID = 13;
        public static final int PEW_FRONT_LEFT_CAN_ID = 12;
    }

    public static final class PWM {
        public static final int SHOOTER_HOOD_SERVO = 0;
    }
    
    public static final class VICTOR_SPX_CAN {
        public static final int CONVEYER_CAN_ID = 10;
    }
    
    public static final int RIGHT_ACTUATOR_CAN_ID = 8;
    public static final int LEFT_ACTUATOR_CAN_ID = 9;
    public static final int COLOR_WHEEL_CAN_ID = 11;
 
    public static final class DRIVE_JOYSTICK_BUTTON {
        public static final int INVERSED_INTAKE_BUTTON = 2;
        public static final int INTAKE_BUTTON = 1;
    }

    public static final class COMPUTER_USB_PORTS {
        public static final int DRIVE_JOYSTICK_USB_ID = 0;
        public static final int XBOX_CONTROLLER_USB_ID = 1;
    }
    
    public static final class MECHANISM_XBOX_BUTTONS {
        public static final int SHOOTER_BUTTON = XboxController.Button.kX.value;
        public static final int INVERSED_SHOOTER_BUTTON = XboxController.Button.kStart.value;
        public static final int CONVEYER_BUTTON = XboxController.Button.kA.value; 
        public static final int INVERSED_CONVEYER_BUTTON = XboxController.Button.kY.value;
    }

    public static final class XBOX_POV_BUTTONS {
        // public static final int SHOOTER_ANGLE_HIGH = 0;
        // public static final int SHOOTER_ANGLE_MID = 90;
        // public static final int SHOOTER_ANGLE_LOW = 180;
        public static final int DRIVE_FORWARD = 0;
        public static final int DRIVE_RIGHT = 90;
        public static final int DRIVE_BACKWARD = 180;
        public static final int DRIVE_LEFT = 270;
    }

    public static final class SHOOTER_ANGLES {
        public static final double HIGH = 90;
        public static final double MID = 45;
        public static final double LOW = 120;
    }
    // Angles only work for 0-170
    
    public static final int RIGHT_ACTUATOR_BUTTON = XboxController.Button.kBumperRight.value;
    public static final int LEFT_ACTUATOR_BUTTON = XboxController.Button.kBumperLeft.value;
    public static final int COLOR_WHEEL_BUTTON = XboxController.Button.kB.value;
    
}
