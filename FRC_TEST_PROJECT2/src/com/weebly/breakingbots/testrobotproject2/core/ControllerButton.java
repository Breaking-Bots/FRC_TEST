package com.weebly.breakingbots.testrobotproject2.core;

import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.command.Command;

public class ControllerButton extends Trigger {

	private Controller controller;
	private int mappedNumber;

	public ControllerButton(Controller controller, int mappedNumber) {
		this.controller = controller;
		this.mappedNumber = mappedNumber;
	}

	public boolean get() {
		return controller.getRawButton(mappedNumber);
	}
	
	public void tapped(final Command command){
		whenActive(command);
	}
	
	public void held(final Command command){
		whileActive(command);
	}
	
	public void released(final Command command){
		whenInactive(command);
	}
	
	public int iterative(){
		return mappedNumber;
	}
	
	

}
