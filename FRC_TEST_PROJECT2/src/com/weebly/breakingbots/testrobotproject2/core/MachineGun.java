package com.weebly.breakingbots.testrobotproject2.core;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class MachineGun extends Subsystem {

	private Servo triggerFinger = RobotMap.triggerFinger;
	private Victor turretXAim = RobotMap.turretXAim;
	private Victor turretYAim = RobotMap.turretYAim;
	
	private float precision = 1f;
	
	protected void initDefaultCommand() {
		
	}
	
	public void setPrecision(final float precision){
		this.precision = MC.clamp(precision, 1f, 10f);
	}
	
	public void pull(){
		triggerFinger.set(1);
	}
	
	public void release(){
		triggerFinger.set(-1);
	}
	
	public void hold(){
		triggerFinger.set(0);
	}
	
	public void aim(double x, double y){
		turretXAim.set(x/precision);
		turretYAim.set(y/precision);
	}

}
