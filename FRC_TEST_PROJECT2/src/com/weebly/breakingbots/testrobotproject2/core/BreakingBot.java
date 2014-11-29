package com.weebly.breakingbots.testrobotproject2.core;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

public class BreakingBot extends IterativeRobot {

	Command autonomousCommand;
	
	public void robotInit(){
		autonomousCommand = new TestCommand();
		CommandBase.init();
	}
	
	public void autonomousInit(){
		autonomousCommand.start();
	}
	
	public void autonomousPeriodic(){
		Scheduler.getInstance().run();
	}
	
	public void teleopInit(){
		autonomousCommand.cancel();
	}
	
	public void teleopPeriodic(){
		Scheduler.getInstance().run();
	}
	
}
