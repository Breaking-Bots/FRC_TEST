package com.weebly.breakingbots.testrobotproject2.core;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;

public class RobotMap {
	public static final Victor clawMotor = new Victor(5);
	public static final Victor wristMotor = new Victor(6);
	public static final AnalogChannel wristPot = new AnalogChannel(7);
	
	public static final Talon flDriveTrain = new Talon(1); 
	public static final Talon frDriveTrain = new Talon(2); 
	public static final Talon blDriveTrain = new Talon(3); 
	public static final Talon brDriveTrain = new Talon(4); 
	
	
	public static final Servo triggerFinger = new Servo(9);
	public static final Victor turretXAim = new Victor(10);
	public static final Victor turretYAim = new Victor(11);
	
	
	private RobotMap(){
		throw new AssertionError("Do not instantiate!");
	}
}
