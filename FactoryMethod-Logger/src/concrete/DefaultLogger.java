package concrete;

import java.util.Date;

import abst.Logger;

public class DefaultLogger extends Logger {

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
		StringBuffer sb = new StringBuffer();
		sb.append("[" + loggerName + "] ");
		sb.append("[" + logDateTime + "] ");
		sb.append(logMessage);
		
		System.out.println(sb.toString());
	}
	

}
