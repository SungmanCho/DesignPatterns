package creator.concrete;

import abst.Logger;
import concrete.DefaultLogger;
import creator.LoggerCreator;

public class DefaultLoggerCreator extends LoggerCreator {

	@Override
	protected int getSolutionType() {
		return 1;
	}

	@Override
	protected Logger createLogger() {
		return new DefaultLogger();
	}

}
