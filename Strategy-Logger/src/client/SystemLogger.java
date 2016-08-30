package client;

import strategy.Logger;
import strategy.impl.DefaultLogger;

public class SystemLogger {

	private Logger logger;
	
	public SystemLogger() {
		this.logger = new DefaultLogger();
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	
	
}
