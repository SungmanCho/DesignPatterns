package abstraction;

import implementor.MorseCodeFunction;

public class PrintMorseCode extends MorseCode {

	public PrintMorseCode(MorseCodeFunction function) {
		super(function);
	}

	public PrintMorseCode a() {
		dot();
		dash();
		space();
		return this;
	}
	
	public PrintMorseCode b() {
		dash();
		dot();
		dot();
		dot();
		space();
		return this;
	}
	
	public PrintMorseCode c() {
		dash();
		dot();
		dash();
		dot();
		space();
		return this;
	}
	
	public PrintMorseCode d() {
		dash();
		dot();
		dot();
		space();
		return this;
	}
	
	public PrintMorseCode e() {
		dot();
		space();
		return this;
	}
	
	public PrintMorseCode f() {
		dot();
		dot();
		dash();
		dot();
		space();
		return this;
	}
	
	public PrintMorseCode g() {
		dash();
		dash();
		dot();
		space();
		return this;
	}
	
	public PrintMorseCode h() {
		dot();
		dot();
		dot();
		dot();
		space();
		return this;
	}
	
	public PrintMorseCode i() {
		dot();
		dot();
		space();
		return this;
	}
	
	public PrintMorseCode j() {
		dot();
		dash();
		dash();
		dash();
		space();
		return this;
	}
	
	public PrintMorseCode k() {
		dash();
		dot();
		dash();
		space();
		return this;
	}
	
	public PrintMorseCode l() {
		dot();
		dash();
		dot();
		dot();
		space();
		return this;
	}
	
	public PrintMorseCode m() {
		dash();
		dash();
		space();
		return this;
	}
	
	public PrintMorseCode n() {
		dash();
		dot();
		space();
		return this;
	}
	
	public PrintMorseCode o() {
		dash();
		dash();
		dash();
		space();
		return this;
	}
	
	public PrintMorseCode p() {
		dot();
		dash();
		dash();
		dot();
		space();
		return this;
	}
	
	public PrintMorseCode q() {
		dash();
		dash();
		dot();
		dash();
		space();
		return this;
	}
	
	public PrintMorseCode r() {
		dot();
		dash();
		dot();
		space();
		return this;
	}
	
	public PrintMorseCode s() {
		dot();
		dot();
		dot();
		space();
		return this;
	}
	
	public PrintMorseCode t() {
		dash();
		space();
		return this;
	}
	
	public PrintMorseCode u() {
		dot();
		dot();
		dash();
		space();
		return this;
	}
	
	public PrintMorseCode v() {
		dot();
		dot();
		dot();
		dash();
		space();
		return this;
	}
	
	public PrintMorseCode w() {
		dot();
		dash();
		dash();
		space();
		return this;
	}
	
	public PrintMorseCode x() {
		dash();
		dot();
		dot();
		dash();
		space();
		return this;
	}
	
	public PrintMorseCode y() {
		dash();
		dot();
		dash();
		dash();
		space();
		return this;
	}
	
	public PrintMorseCode z() {
		dash();
		dash();
		dot();
		dot();
		space();
		return this;
	}
	
}
