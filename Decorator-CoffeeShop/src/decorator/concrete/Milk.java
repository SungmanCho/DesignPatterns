package decorator.concrete;

import component.IBeverage;
import decorator.AbstractAdding;

public class Milk extends AbstractAdding {

	public Milk(IBeverage base) {
		super(base);
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + 1000;
	}

}
