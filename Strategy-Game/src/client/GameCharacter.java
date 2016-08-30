package client;

import strategy.Weapon;
import strategy.impl.Punch;

public class GameCharacter {

	private Weapon weapon;
	
	public GameCharacter() {
		this.weapon = new Punch();
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
}
