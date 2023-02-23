package com.credersi.animals;

public class Tiger extends Animal implements Purr, Fights {
	public Tiger () { }
		
	public int purr() {
		return 50;
	}
	
	public boolean fights() {
		return true;
	}
	
	public int fightStrength() {
		return 60;
	}
}
