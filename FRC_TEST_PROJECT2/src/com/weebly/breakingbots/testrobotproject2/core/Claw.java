package com.weebly.breakingbots.testrobotproject2.core;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Claw extends Subsystem {

	Victor motor = RobotMap.clawMotor;
	
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}
	
	public void open(){
		motor.set(1);
	}
	public void close(){
		motor.set(-1);
	}
	public void stop(){
		motor.set(0);
	}

}
