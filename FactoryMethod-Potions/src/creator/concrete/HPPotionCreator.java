package creator.concrete;

import java.util.Date;

import creator.PotionCreator;
import product.Potion;
import product.concrete.HPPotion;

public class HPPotionCreator extends PotionCreator {

	private String potionName;
	
	public HPPotionCreator(String potionName) {
		this.potionName = potionName;
	}

	@Override
	protected void getPotionDataFromDB() {
		System.out.println("DB 에서 HP Potion 정보를 가져온다.");
	}

	@Override
	protected void printPotionData() {
		System.out.println( potionName + " 생성 " + new Date() );
	}
	
	@Override
	protected Potion createPotion() {
		return new HPPotion();
	}

}
