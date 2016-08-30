package concrete;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import abst.Logger;

public class FileWriteLogger extends Logger {

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
		
		writeFile(sb.toString());
	}
	
	private void writeFile(String message) {
		File logFile = new File("d:\\logger.txt");
		
		// 파일 생성
		if ( !logFile.exists() ) {
			try {
				logFile.createNewFile();
			} catch (IOException e) {
				throw new RuntimeException(e.getMessage(), e);
			}
		}
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(logFile);
			fw.write(message);
		} 
		catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		finally {
			if ( fw != null ) {
				try {
					fw.close();
				} catch (IOException e) {}
			}
		}
	}
	

}
