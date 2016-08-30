package strategy.impl;

import strategy.Weapon;

public class Glove implements Weapon {

	private final int damage = 10;
	
	@Override
	public void attack() {
		System.out.printf("글러브(공격력 :%d)로 때립니다.\n", damage);
	}

}
