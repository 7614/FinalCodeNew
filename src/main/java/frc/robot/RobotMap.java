/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
   public static final int FRONTRIGHTMOTOR = 1;
   public static final int FRONTLEFTMOTOR = 2;
   public static final int BACKRIGHTMOTOR = 3;
   public static final int BACKLEFTMOTOR = 4;
   public static final int JOYSTICKPORT = 5;
   public static final int WRISTMOTOR = 6;
   public static final int ELBOWMOTOR = 7;
   public static final int SHOULDERMOTOR = 8;
   public static final int BALLINTAKE1 = 9;
   public static final int BALLINTAKE2 = 10;
   public static final int SOL1 = 11;
   public static final int SOL2 = 12;
   public static final int WRISTPOTENTIOMETER = 13;
   public static final int ELBOWPOTENTIOMETER = 14;
   public static final int SHOULDERPOTENTIOMETER = 15;
   public static final int SHOULDERLIMITSWITCH = 16;
   public static final int ELBOWLIMITSWITCH = 17;
   public static final int xboxLeftBumper = 1;
   public static final int xboxRightBumper =2;
   public static final int xboxAButton = 3;
   public static final int xboxBButton = 4;
   public static final int xboxXButton = 5; 
  
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
