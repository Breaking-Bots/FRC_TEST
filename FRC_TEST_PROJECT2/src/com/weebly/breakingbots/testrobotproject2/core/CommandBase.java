package com.weebly.breakingbots.testrobotproject2.core;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public abstract class CommandBase extends Command {

	public static OI oi;
	
	public static TestSubsystem testSubsystem = new TestSubsystem();
	public static Claw claw = new Claw();
	public static DriveTrain driveTrain = new DriveTrain(oi.controller);
	public static MachineGun turret = new MachineGun();
	
	public static void init(){
		oi = OI.getInstance();
		
		SmartDashboard.putData(testSubsystem);
	}
	
	public CommandBase(String name){
		super(name);
	}

	public CommandBase(){
		super();
	}
	
}
