package strategy.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import strategy.Logger;

public class FileLogger implements Logger {

	@Override
	public void write(String message) {
		
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
