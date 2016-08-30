package strategy.impl;

import strategy.Logger;

public class ConsoleWithFileLogger implements Logger {

	@Override
	public void write(String message) {
		consoleWrite(message);
		fileWrite(message);
	}
	
	private void consoleWrite(String message) {
		Logger logger = new DefaultLogger();
		logger.write(message);
	}
	
	private void fileWrite(String message) {
		Logger logger = new FileLogger();
		logger.write(message);
	}

}
