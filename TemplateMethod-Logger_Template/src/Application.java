import abst.Logger;
import concrete.DefaultLogger;

public class Application {

	public static void main(String[] args) {
		
		Logger logger = new DefaultLogger();
		logger.log("ggg");
		
	}
	
}
