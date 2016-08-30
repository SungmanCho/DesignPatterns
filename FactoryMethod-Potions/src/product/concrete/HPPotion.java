package product.concrete;

import product.Potion;

public class HPPotion implements Potion {

	@Override
	public void use() {
		System.out.println("체력이 모두 회복되었습니다!");
	}

}
