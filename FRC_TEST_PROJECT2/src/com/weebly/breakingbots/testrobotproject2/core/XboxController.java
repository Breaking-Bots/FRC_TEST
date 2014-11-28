package com.weebly.breakingbots.testrobotproject2.core;

public class XboxController extends Controller{

	public final ControllerButton A;
	public final ControllerButton B;
	public final ControllerButton X;
	public final ControllerButton Y;
	public final ControllerButton LB;
	public final ControllerButton RB;
	public final ControllerButton BACK;
	public final ControllerButton START;
	public final ControllerButton L3;
	public final ControllerButton R3;
	public final ControllerButton RT;
	public final ControllerButton LT;
	
	public XboxController(int port) {
		super(port);
		A = new ControllerButton(this, 1);
		B = new ControllerButton(this, 2);
		X = new ControllerButton(this, 3);
		Y = new ControllerButton(this, 4);
		LB = new ControllerButton(this, 5);
		RB = new ControllerButton(this, 6);
		BACK = new ControllerButton(this, 7);
		START = new ControllerButton(this, 8);
		L3 = new ControllerButton(this, 9);
		R3 = new ControllerButton(this, 10);
		RT = new ControllerButton(this, 11);
		LT = new ControllerButton(this, 12);
	}
	
	//Unfortunately we only have 2 hands
	public double getZ(Hand hand) {
		return 0;
	}
	
	public boolean getBumper(Hand hand) {
		if (hand == Hand.kLeft) {
			return LB.get();
		} else if (hand == Hand.kRight) {
			return RB.get();
		} else {
			return false;
		}
	}

	public boolean getTrigger(Hand hand) {
		if (hand == Hand.kLeft) {
			return LT.get();
		} else if (hand == Hand.kRight) {
			return RT.get();
		} else {
			return false;
		}
	}

	public boolean getTop(Hand hand) {
		if (hand == Hand.kLeft) {
			return  L3.get();
		} else if (hand == Hand.kRight) {
			return  R3.get();
		} else {
			return false;
		}
	}


	public boolean getRawButton(int button) {
		  if(button == RT.iterative()) { 
	            if(getThrottle() <= -.6) {
	                return true;
	            }
	            else {
	                return false;
	            }
	        }
	        if(button == LT.iterative()) { 
	            if(getThrottle() >= .6) {
	                return true;
	            }
	            else {
	                return false;
	            }
	        }
	        return ((0x1 << (button - 1)) & driverStation.getStickButtons(port)) != 0;
	}
}
