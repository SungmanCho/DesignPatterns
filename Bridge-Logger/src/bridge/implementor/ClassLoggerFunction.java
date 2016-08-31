package bridge.implementor;

public interface ClassLoggerFunction {

	public void writeLog(String loggerName, String logDateTime, Object caller, String logMessage);
	
}
