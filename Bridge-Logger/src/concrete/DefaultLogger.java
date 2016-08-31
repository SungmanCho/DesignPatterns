package concrete;

import java.util.Date;

import bridge.abstraction.ClassLogger;
import bridge.implementor.ClassLoggerFunction;

public class DefaultLogger extends ClassLogger {

	public DefaultLogger(ClassLoggerFunction function, Object caller) {
		super(function, caller);
	}

	@Override
	protected String getLoggerName() {
		return "FileWriteLogger";
	}

	@Override
	protected String getLogDateTime() {
		return new Date().toString();
	}

	@Override
	protected void writeLog(String loggerName, String logDateTime, String logMessage) {
		super.writeLog(loggerName, logDateTime, logMessage);
	}
	

}
