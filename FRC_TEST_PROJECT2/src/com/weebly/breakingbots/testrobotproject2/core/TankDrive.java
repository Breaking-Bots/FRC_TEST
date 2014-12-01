package com.weebly.breakingbots.testrobotproject2.core;

public class TankDrive extends CommandBase {

	public TankDrive(){
		requires(driveTrain);
	}
	
	protected void initialize() {
	}

	
	protected void execute() {
		driveTrain.tankDrive();

	}

	
	protected boolean isFinished() {
		return false;
	}

	
	protected void end() {

	}

	
	protected void interrupted() {
	}

}
