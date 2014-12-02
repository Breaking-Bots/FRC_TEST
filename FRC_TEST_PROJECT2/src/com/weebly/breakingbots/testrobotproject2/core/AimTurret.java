package com.weebly.breakingbots.testrobotproject2.core;

import edu.wpi.first.wpilibj.GenericHID;

public class AimTurret extends CommandBase {

	private Controller c;
	
	public AimTurret(){
		requires(turret);
	}
	
	protected void initialize() {
		c = oi.controller;
	}

	
	protected void execute() {
		turret.aim(c.getX(GenericHID.Hand.kRight), c.getX(GenericHID.Hand.kRight));
	}

	
	protected boolean isFinished() {
		return false;
	}

	
	protected void end() {
		c = null;
	}

	
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
