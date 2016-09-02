package client;

import subsystem.SubSystemFacade;

public class Application {

	public static void main(String[] args) {
		
		SubSystemFacade facade = new SubSystemFacade();
		facade.inputAndPrintMessage();
		facade.inputAndWriteMessage();
		
	}
	
}
