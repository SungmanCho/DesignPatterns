package decorator.concrete;

import component.IBeverage;
import decorator.AbstractAdding;

public class Water extends AbstractAdding {

	public Water(IBeverage base) {
		super(base);
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTotalPrice() + 300;
	}

}
