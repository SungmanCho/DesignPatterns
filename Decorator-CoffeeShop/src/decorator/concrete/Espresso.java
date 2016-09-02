package decorator.concrete;

import component.IBeverage;
import decorator.AbstractAdding;

public class Espresso extends AbstractAdding {

	public Espresso(IBeverage base) {
		super(base);
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + 500;
	}

}
