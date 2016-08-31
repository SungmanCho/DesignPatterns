package implementor.concrete;

import implementor.MorseCodeFunction;

public class DefaultMorseCode implements MorseCodeFunction {

	@Override
	public void dot() {
		System.out.print(".");
	}

	@Override
	public void dash() {
		System.out.print("_");
	}

	@Override
	public void space() {
		System.out.print(" ");
	}

	
	
}
