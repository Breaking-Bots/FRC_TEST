package com.weebly.breakingbots.testrobotproject2.core;

import java.util.Random;

/**
 * A numerical randomizer which operates on 128 bit xor shifts
 * @author Zaeem
 * @version 1.0
 */
public class Randomizer extends Random{
	long seed0, seed1;
	/**
	 * Creates a randomizer with two specified seeds
	 * @param seed0
	 * @param seed1
	 */
	public Randomizer(long seed0, long seed1) {
		this.seed0 = seed0;
		this.seed1 = seed1;
	}
	/**
	 * Creates a randomizer
	 */
	public Randomizer() {
		Random random = new Random();
		seed0 = random.nextLong();
		seed1 = random.nextLong();
	}

	@Override
	protected int next(int bits) {
		long s1 = seed0;
		long s0 = seed1;
		seed0 = s0;
		s1 ^= s1 << 23; // a
		s1 = (s1 ^ s0 ^ (s1 >> 17) ^ (s0 >> 26)) + s0; // b, c
		seed1 = s1;
		return (int) (s1 & ((1L << bits) - 1));
	}
}
