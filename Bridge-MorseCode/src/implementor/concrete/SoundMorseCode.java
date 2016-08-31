package implementor.concrete;

import implementor.MorseCodeFunction;

public class SoundMorseCode implements MorseCodeFunction {

	@Override
	public void dot() {
		System.out.print("ªÂ");
	}

	@Override
	public void dash() {
		System.out.print("ªﬂ¿Ã");
	}

	@Override
	public void space() {
		System.out.print(" ");
	}

	
	
}
