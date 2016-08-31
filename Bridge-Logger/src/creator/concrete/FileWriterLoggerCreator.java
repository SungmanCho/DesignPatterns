package creator.concrete;

import abst.Logger;
import concrete.FileWriteLogger;
import creator.LoggerCreator;

public class FileWriterLoggerCreator extends LoggerCreator {

	@Override
	protected int getSolutionType() {
		return 1;
	}

	@Override
	protected Logger createLogger() {
		return new FileWriteLogger();
	}

}
