import creator.PotionCreator;
import creator.concrete.HPPotionCreator;
import creator.concrete.MPPotionCreator;
import product.Potion;

public class Application {

	public static void main(String[] args) {
		
		PotionCreator potionCreator = new HPPotionCreator("회복 물약");
		Potion hpPotion = potionCreator.create();
		hpPotion.use();
		
		potionCreator = new MPPotionCreator("회복 물약");
		Potion mpPotion = potionCreator.create();
		mpPotion.use();
		
	}
	
}
