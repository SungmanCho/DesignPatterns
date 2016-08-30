package product.concrete;

import product.Potion;

public class MPPotion implements Potion {

	@Override
	public void use() {
		System.out.println("마력이 모두 회복 되었습니다!");
	}

}
