package com.credersi.animals;

public class PolarBear extends Animal implements Fights, Swims {
	public PolarBear() {}
	
	public boolean fights() {
		return true;
	}
	
	public int fightStrength() {
		return 70;
	}
	
	public boolean swims() {
		return true;
	}
	
	public int swimStrength() {
		return 15;
	}
}
