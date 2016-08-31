package bridge.implementor.concrete;

import bridge.implementor.ClassLoggerFunction;

public class PrintClassLogger implements ClassLoggerFunction {

	@Override
	public void writeLog(String loggerName, String logDateTime, Object caller, String logMessage) {
		StringBuffer sb = new StringBuffer();
		sb.append("[" + loggerName + "] ");
		sb.append("[" + logDateTime + "] ");
		sb.append("[" + caller.toString() + "] ");
		sb.append(logMessage);
		
		System.out.println(sb.toString());
	}

	
	
}
