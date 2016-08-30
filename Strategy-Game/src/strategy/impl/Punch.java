package strategy.impl;

import strategy.Weapon;

public class Punch implements Weapon {

	private final int damage = 5;
	
	@Override
	public void attack() {
		System.out.printf("맨주먹(공격력 :%d)으로 때립니다.\n", damage);
	}

}
