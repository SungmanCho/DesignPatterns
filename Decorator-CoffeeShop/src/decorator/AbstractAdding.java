package decorator;

import component.IBeverage;

public abstract class AbstractAdding implements IBeverage {

	private IBeverage base;
	
	public AbstractAdding(IBeverage base) {
		super();
		this.base = base;
	}
	
	public void setBase(IBeverage base) {
		this.base = base;
	}
	
	@Override
	public int getTotalPrice() {
		return base.getTotalPrice();
	}
	
}
