package adapter;

import legacy.adaptee.DoubleCalculator;
import system.target.FloatCalculator;

public class DoubleAdapter implements FloatCalculator {
	
	private DoubleCalculator calculator;
	
	public DoubleAdapter(DoubleCalculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public float getHalf(int number) {
		return (float) calculator.getHalf(number);
	}

	@Override
	public float getDouble(int number) {
		return (float) calculator.getDouble(number);
	}

	
}
