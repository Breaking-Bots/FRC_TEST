package com.weebly.breakingbots.testrobotproject2.core;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public abstract class CommandBase extends Command {

	public static OI oi;
	
	public static TestSubsystem testSubsystem = new TestSubsystem();
	
	public static void init(){
		oi = new OI();
		
		SmartDashboard.putData(testSubsystem);
	}
	
	public CommandBase(String name){
		super(name);
	}

	public CommandBase(){
		super();
	}
	
}
