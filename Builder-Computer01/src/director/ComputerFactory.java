package director;

import builder.ComputerBluePrint;
import product.Computer;

public class ComputerFactory {

	private ComputerBluePrint bluePrint;
	
	public ComputerFactory(ComputerBluePrint bluePrint) {
		this.bluePrint = bluePrint;
	}
	
	public void make() {
		bluePrint.setCpu();
		bluePrint.setMainBoard();
		bluePrint.setRam();
		bluePrint.setStorage();
		bluePrint.setVga();
	}
	
	public Computer get() {
		return bluePrint.getComputer();
	}
	
}
