package creator.concrete;

import abst.Logger;
import concrete.ComplexLogger;
import creator.LoggerCreator;

public class ComplexLoggerCreator extends LoggerCreator {

	@Override
	protected int getSolutionType() {
		return 1;
	}

	@Override
	protected Logger createLogger() {
		return new ComplexLogger();
	}

}
