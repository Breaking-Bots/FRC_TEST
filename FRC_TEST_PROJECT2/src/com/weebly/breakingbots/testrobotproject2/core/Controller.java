package com.weebly.breakingbots.testrobotproject2.core;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.parsing.IInputOutput;

public abstract class Controller extends GenericHID implements IInputOutput{

	protected DriverStation driverStation;
	protected final int port;
	
	protected Controller(int port) {
		super();
		this.port = port;
		driverStation = DriverStation.getInstance();
	}
	
	public static final class AxisType{
		public final int enumerator;
		
		private AxisType(int enumerator){
			this.enumerator = enumerator;
		}
		
		public static final AxisType LX = new AxisType(1);
		public static final AxisType LY = new AxisType(2);
		public static final AxisType TRIGGER = new AxisType(3);
		public static final AxisType RX = new AxisType(4);
		public static final AxisType RY = new AxisType(5);
		public static final AxisType DX = new AxisType(6);
		
	}
	
	public final double getX(Hand hand) {
		if(hand.value == Hand.kRight.value) {
            return getAxis(AxisType.RX);
        } else if(hand.value == Hand.kLeft.value) {
            return getAxis(AxisType.LX);
        } else {
            return 0;
        }
	}

	public final double getY(Hand hand) {
		if(hand.value == Hand.kRight.value) {
            return getAxis(AxisType.RY);
        } else if(hand.value == Hand.kLeft.value) {
            return getAxis(AxisType.LY);
        } else {
            return 0;
        }
	}

	public abstract double getZ(Hand hand) ;

	public final double getTwist() {
		return getAxis(AxisType.DX);
	}

	public final double getThrottle() {
		return getAxis(AxisType.TRIGGER);
	}

	public final double getRawAxis(int axis) {
		return driverStation.getStickAxis(port, axis);
	}

	public final double getAxis(AxisType axis){
		return getRawAxis(axis.enumerator);
	}
	
	public abstract boolean getTrigger(Hand hand) ;

	public abstract boolean getTop(Hand hand) ;
	public abstract boolean getBumper(Hand hand);

	public abstract boolean getRawButton(int button);
}