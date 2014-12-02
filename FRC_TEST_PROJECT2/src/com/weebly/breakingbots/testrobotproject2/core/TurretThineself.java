package com.weebly.breakingbots.testrobotproject2.core;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class TurretThineself extends CommandGroup {
	public TurretThineself(){
		super();
		addParallel(new AimTurret());
		addParallel(new Scope());
		addParallel(new Shoot());
	}
}
