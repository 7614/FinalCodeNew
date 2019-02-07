/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class ExampleSubsystem extends Subsystem {
  private WPI_VictorSPX motor1 = new WPI_VictorSPX(RobotMap.HATCHMOTOR);
  @Override
  protected void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public void flapErect(){
      motor1.set(1);
  }
  public void flapFlacid(){
      motor1.set(0);
  }
}
