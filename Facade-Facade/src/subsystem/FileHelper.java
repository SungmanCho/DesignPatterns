package subsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileHelper {

	public void writeFile(String text) {
		
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
			fw.write(text);
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
