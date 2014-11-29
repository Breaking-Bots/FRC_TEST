package com.weebly.breakingbots.testrobotproject2.core;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

public class Wrist extends PIDSubsystem {

	Victor motor = RobotMap.wristMotor;
	AnalogChannel pot = RobotMap.wristPot;
	
	
	public Wrist() {
		super("Wrist", 2,0,0);
		setAbsoluteTolerance(0.05);
		getPIDController().setContinuous(false);
		
	}


	protected double returnPIDInput() {
		return pot.getAverageVoltage();
	}

	
	protected void usePIDOutput(double output) {
		motor.pidWrite(output);
	}

	
	protected void initDefaultCommand() {

	}

}
