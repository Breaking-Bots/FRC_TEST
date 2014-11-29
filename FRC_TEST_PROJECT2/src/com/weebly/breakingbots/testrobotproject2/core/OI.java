package com.weebly.breakingbots.testrobotproject2.core;

public class OI {
	PSController controller = new PSController(1);
	
	public OI(){
		controller.R2.tapped(new OpenClaw());
	}
}
