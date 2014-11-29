package com.weebly.breakingbots.testrobotproject2.core;


import edu.wpi.first.wpilibj.GenericHID.Hand;

public class PSController extends Controller {

	public final ControllerButton X;
	public final ControllerButton O;
	public final ControllerButton S;
	public final ControllerButton T;
	public final ControllerButton L1;
	public final ControllerButton R1;
	public final ControllerButton BACK;
	public final ControllerButton START;
	public final ControllerButton L3;
	public final ControllerButton R3;
	public final ControllerButton R2;
	public final ControllerButton L2;
	
	public PSController(int port) {
		super(port);
		X = new ControllerButton(this, 1);
		O = new ControllerButton(this, 2);
		S = new ControllerButton(this, 3);
		T = new ControllerButton(this, 4);
		L1 = new ControllerButton(this, 5);
		R1 = new ControllerButton(this, 6);
		BACK = new ControllerButton(this, 7);
		START = new ControllerButton(this, 8);
		L3 = new ControllerButton(this, 9);
		R3 = new ControllerButton(this, 10);
		R2 = new ControllerButton(this, 11);
		L2 = new ControllerButton(this, 12);
	}

	//Unfortunately we only have 2 hands
	public double getZ(Hand hand) {
		return 0;
	}
	
	public boolean getBumper(Hand hand) {
		if (hand == Hand.kLeft) {
			return L1.get();
		} else if (hand == Hand.kRight) {
			return R1.get();
		} else {
			return false;
		}
	}

	public boolean getTrigger(Hand hand) {
		if (hand == Hand.kLeft) {
			return L2.get();
		} else if (hand == Hand.kRight) {
			return R2.get();
		} else {
			return false;
		}
	}

	public boolean getTop(Hand hand) {
		if (hand == Hand.kLeft) {
			return L3.get();
		} else if (hand == Hand.kRight) {
			return R3.get();
		} else {
			return false;
		}
	}


	public boolean getRawButton(int button) {
		if(button == R2.iterative()) { 
            if(getThrottle() <= -0.6) {
                return true;
            }
            else {
                return false;
            }
        }
        if(button == L2.iterative()) { 
            if(getThrottle() >= 0.6) {
                return true;
            }
            else {
                return false;
            }
        }
        return ((0x1 << (button - 1)) & driverStation.getStickButtons(port)) != 0;
	}

	
}
