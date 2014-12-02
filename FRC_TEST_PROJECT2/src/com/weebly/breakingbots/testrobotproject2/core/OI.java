package com.weebly.breakingbots.testrobotproject2.core;

public class OI {
	public final PSController controller = new PSController(1);
	
	private static final OI instance = new OI();
	
	private OI(){

	}
	
	public static OI getInstance(){
		return instance;
		
	}
}
