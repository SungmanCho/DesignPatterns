package creator.concrete;

import java.util.Date;

import creator.PotionCreator;
import product.Potion;
import product.concrete.MPPotion;

public class MPPotionCreator extends PotionCreator {

	private String potionName;
	
	public MPPotionCreator(String potionName) {
		this.potionName = potionName;
	}
	
	@Override
	protected void getPotionDataFromDB() {
		System.out.println("DB 에서 MP Potion 정보를 가져온다.");
	}

	@Override
	protected void printPotionData() {
		System.out.println(potionName + " 생성 " + new Date() );
	}
	
	@Override
	protected Potion createPotion() {
		return new MPPotion();
	}

}
