import client.SystemLogger;
import strategy.impl.ConsoleWithFileLogger;
import strategy.impl.FileLogger;

public class Application {

	public static void main(String[] args) {
		SystemLogger logger = new SystemLogger();
		logger.getLogger().write("콘솔 로거");
		
		logger.setLogger(new FileLogger());
		logger.getLogger().write("파일로거");
		
		logger.setLogger(new ConsoleWithFileLogger());
		logger.getLogger().write("파일로거");
	}
	
}
