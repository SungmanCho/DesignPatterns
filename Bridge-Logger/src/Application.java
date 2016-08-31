import abst.Logger;
import concrete.DefaultLogger;
import creator.LoggerCreator;
import creator.concrete.DefaultLoggerCreator;

public class Application {

	public static void main(String[] args) {
		LoggerCreator creator = new DefaultLoggerCreator(Application.class);
		Logger logger = creator.createLogger(1);
		logger.log("ggg");
	}
	
}
