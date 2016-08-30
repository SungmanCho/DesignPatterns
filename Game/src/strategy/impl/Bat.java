package strategy.impl;

import strategy.Weapon;

public class Bat implements Weapon {

	private final int damage = 30;
	
	@Override
	public void attack() {
		System.out.printf("¹æ¸ÁÀÌ(°ø°İ·Â :%d)¸¦ ÈÖµÎ¸¨´Ï´Ù.\n", damage);
	}

}
