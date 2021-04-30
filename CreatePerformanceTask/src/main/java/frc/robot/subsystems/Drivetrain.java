// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */
  public Drivetrain() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
 
    // These are the motors of the drivetrain.// 
    // left motor and its followers
    TalonSRX leftLeader = new TalonSRX(5);
    TalonSRX leftFollower = new TalonSRX(6);
    // right motor and its follower 
    TalonSRX rightLeader = new TalonSRX(7);
    TalonSRX rightFollower = new TalonSRX(8);

    leftFollower.follow(leftLeader);
    rightFollower.follow(rightLeader);
    
    
 
  }
}
