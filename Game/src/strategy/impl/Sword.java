package strategy.impl;

import strategy.Weapon;

public class Sword implements Weapon {

	private final int damage = 80;
	
	@Override
	public void attack() {
		System.out.printf("Ä®(°ø°Ý·Â :%d)À» ÈÖµÎ¸¨´Ï´Ù.\n", damage);
	}

}
