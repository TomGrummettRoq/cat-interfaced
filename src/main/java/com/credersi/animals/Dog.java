package com.credersi.animals;

public class Dog extends Animal implements Growl, Fights {
	public Dog() {}
	
	public boolean growls() {
		return true;
	}
	
	public int growlVolume() {
		return 40;
	}
	
	public boolean fights() {
		return false;
	}
	
	public int fightStrength() {
		return 40;
	}
	
}