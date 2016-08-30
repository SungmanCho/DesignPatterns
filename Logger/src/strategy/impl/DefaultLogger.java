package strategy.impl;

import strategy.Logger;

public class DefaultLogger implements Logger {

	@Override
	public void write(String message) {
		System.out.println(message);
	}

}
