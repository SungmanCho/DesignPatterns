package creator;

import product.Potion;

public abstract class PotionCreator {

	protected abstract void getPotionDataFromDB();
	protected abstract void printPotionData();
	protected abstract Potion createPotion();
	
	public Potion create() {
		getPotionDataFromDB();
		printPotionData();
		return createPotion();
	}
	
}
