package implementor.concrete;

import implementor.MorseCodeFunction;

public class LightMorseCode implements MorseCodeFunction {

	@Override
	public void dot() {
		System.out.print("¡Û");
	}

	@Override
	public void dash() {
		System.out.print("¡Ü");
	}

	@Override
	public void space() {
		System.out.print(" ");
	}

	
	
}
