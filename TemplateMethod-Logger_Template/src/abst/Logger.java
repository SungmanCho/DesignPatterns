package abst;

public abstract class Logger {

	private String loggerName;
	private String logDateTime;
	
	protected abstract String getLoggerName();
	protected abstract String getLogDateTime();
	
	protected abstract void writeLog(String loggerName, String logDateTime, String logMessage);
	
	public void log(String logMessage) {
		loggerName = getLoggerName();
		logDateTime = getLogDateTime();
		
		writeLog(loggerName, logDateTime, logMessage);
	}
	
	
}
