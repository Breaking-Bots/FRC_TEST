package com.weebly.breakingbots.testrobotproject2.core;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


public class DriveTrain extends Subsystem{

	
	/*
	 * ______________________
	 * |					|
	 * |mfl				 mfr|
	 * |					|
	 * |					|
	 * |					|
	 * |					|
	 * |				    |
	 * |					|	
	 * |					|
	 * |					|
	 * |					|
	 * |mbl				 mbr|
	 * |____________________|
	 */
	private SpeedController mfl = RobotMap.flDriveTrain;
	private SpeedController mfr = RobotMap.frDriveTrain;
	private SpeedController mml;
	private SpeedController mmr;
	private SpeedController mbl = RobotMap.blDriveTrain;
	private SpeedController mbr = RobotMap.brDriveTrain;
	private final Controller c;
	RobotDrive drive;
	
	public DriveTrain(final Controller controller){
		super();
		c = controller;
		drive = new RobotDrive(mfl, mbl, mfr, mbr);
		
		System.out.println(getName() + " Initialized");
	}
	
	public void tankDrive(){
		tankDrive(c.getY(GenericHID.Hand.kLeft),c.getY(GenericHID.Hand.kRight));
	}
	
	public void tankDrive(double left, double right){
		drive.tankDrive(left, right);
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
	}
	
	
	
	
	
}
