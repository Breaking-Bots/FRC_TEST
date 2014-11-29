package com.weebly.breakingbots.testrobotproject2.core;

public class OpenClaw extends CommandBase {

	public OpenClaw(){
		requires(claw);
		setTimeout(0.9);
	}
	
	protected void initialize() {
		claw.open();
	}

	
	protected void execute() {
	}

	
	protected boolean isFinished() {
		return isTimedOut();
	}

	
	protected void end() {
		claw.stop();
	}

	
	protected void interrupted() {
		end();
	}

}
