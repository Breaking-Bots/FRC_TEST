package com.weebly.breakingbots.testrobotproject2.core;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Victor;

public class RobotMap {
	public static final Victor clawMotor = new Victor(4);
	public static final Victor wristMotor = new Victor(5);
	public static final AnalogChannel wristPot = new AnalogChannel(6);
}
