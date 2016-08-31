package creator;

import abst.Logger;

public abstract class LoggerCreator {

	protected abstract int getSolutionType();
	protected abstract Logger createLogger();
	
	public Logger createLogger(int solutionType) {
		
		Logger logger = null;
		
		if ( solutionType == getSolutionType() ) {
			logger = createLogger();
		}
		
		return logger;
	}
	
}
