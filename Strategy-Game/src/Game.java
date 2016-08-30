import client.GameCharacter;
import strategy.impl.Bat;
import strategy.impl.Glove;
import strategy.impl.Sword;

public class Game {

	public static void main(String[] args) {
		
		GameCharacter character = new GameCharacter();
		character.getWeapon().attack();
		
		character.setWeapon(new Glove());
		character.getWeapon().attack();
		
		character.setWeapon(new Bat());
		character.getWeapon().attack();
		
		character.setWeapon(new Sword());
		character.getWeapon().attack();
	}
	
}
