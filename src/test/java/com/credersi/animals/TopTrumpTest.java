package com.credersi.animals;

import static org.junit.Assert.*;

import org.junit.Test;

public class TopTrumpTest {

	@Test
	public void testStrength() {
		PolarBear polarBear = new PolarBear();
		Tiger tiger = new Tiger();
	
		int tigerStrength = tiger.fightStrength();
		int polarStrength = polarBear.fightStrength();
		
		assertTrue(polarStrength>tigerStrength);
	}
	
	@Test
	public void swimTest() {
		Swims orca = new Orca();
		Swims polarBear = new PolarBear();
		
		int polarSwim = polarBear.swimStrength();
		int orcaSwim = orca.swimStrength();
		
		assertTrue(orcaSwim>polarSwim);
	}
	
	
	@Test
	public void testVictory() {
		Fights polarBear = new PolarBear();
		Fights tiger = new Tiger();
		
		if (tiger.fights() == true && polarBear.fights() == true) {
			int tigerStrength = tiger.fightStrength();
			int polarStrength = polarBear.fightStrength();		
			
			assertTrue(polarStrength>tigerStrength); {
			};
		}
		
	}
	
	
}


