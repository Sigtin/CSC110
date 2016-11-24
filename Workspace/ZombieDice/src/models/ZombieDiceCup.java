package models;

import java.util.Random;

import enums.ZombieDiceDieType;

public class ZombieDiceCup {

	public static ZombieDiceDie getDie() {
		Random rand = new Random();
		int randNum = rand.nextInt(100);
		ZombieDiceDie die;

		if (randNum >= 0 && randNum <= 45) {
			die = new ZombieDiceDie(ZombieDiceDieType.GREEN);
		} else if (randNum >= 46 && randNum <= 76) {
			die = new ZombieDiceDie(ZombieDiceDieType.YELLOW);
		} else {
			die = new ZombieDiceDie(ZombieDiceDieType.RED);
		}
		
		return die;
	}

}
