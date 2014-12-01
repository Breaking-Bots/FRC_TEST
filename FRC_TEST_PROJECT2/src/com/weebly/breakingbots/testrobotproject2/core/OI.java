package com.weebly.breakingbots.testrobotproject2.core;

public class OI {
	public PSController controller = new PSController(1);
	
	private static final OI instance = new OI();
	
	private OI(){
		controller.R2.tapped(new OpenClaw());
	}
	
	public static OI getInstance(){
		return instance;
		
	}
}
