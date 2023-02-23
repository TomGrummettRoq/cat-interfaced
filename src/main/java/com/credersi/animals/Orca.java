package com.credersi.animals;

public class Orca extends Animal implements Fights, Swims {
	public Orca() {} 
	
	public boolean fights() {
		return true;
	}
	
	public int fightStrength() {
		return 50;
	}
	
	public boolean swims() {
		return true;
	}
	
	public int swimStrength() {
		return 100;
	}
}
