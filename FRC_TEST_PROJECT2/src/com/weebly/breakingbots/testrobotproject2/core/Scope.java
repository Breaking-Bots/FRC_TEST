package com.weebly.breakingbots.testrobotproject2.core;

public class Scope extends CommandBase {

	
	public Scope(){
		requires(turret);
		
	}
	
	protected void initialize() {
		turret.setPrecision(2f);
	}

	
	protected void execute() {
		

	}

	
	protected boolean isFinished() {
		return !oi.controller.L2.get();
	}

	
	protected void end() {
		turret.setPrecision(1f);
	}

	
	protected void interrupted() {

	}

}
