package com.weebly.breakingbots.testrobotproject2.core;

import edu.wpi.first.wpilibj.Timer;

public class Shoot extends CommandBase {

	
	public Shoot(){
		requires(turret);
	}
	
	protected void initialize() {

	}

	
	protected void execute() {
		turret.pull();
		Timer.delay(0.4);
		turret.hold();
	}

	
	protected boolean isFinished() {
		return !oi.controller.R2.get();
	}

	
	protected void end() {
		turret.release();
		Timer.delay(0.4);
		turret.hold();
	}

	
	protected void interrupted() {


	}

}
