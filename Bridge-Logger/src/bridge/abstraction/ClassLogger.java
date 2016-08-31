package bridge.abstraction;

import abst.Logger;
import bridge.implementor.ClassLoggerFunction;

public abstract class ClassLogger extends Logger {

	private ClassLoggerFunction function;
	protected Object caller;

	public ClassLogger(ClassLoggerFunction function, Object caller) {
		this.function = function;
		this.caller = caller;
	}
	
	@Override
	protected void writeLog(String loggerName, String logDateTime, String logMessage) {
		function.writeLog(loggerName, logDateTime, caller, logMessage);
	}

}
