package creator.concrete;

import abst.Logger;
import bridge.implementor.concrete.PrintClassLogger;
import concrete.DefaultLogger;
import creator.LoggerCreator;

public class DefaultLoggerCreator extends LoggerCreator {

	private Object caller;
	
	public DefaultLoggerCreator(Object caller) {
		this.caller = caller;
	}

	@Override
	protected int getSolutionType() {
		return 1;
	}

	@Override
	protected Logger createLogger() {
		return new DefaultLogger(new PrintClassLogger(), caller);
	}

}
