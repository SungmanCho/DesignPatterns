package builder;

import product.Computer;

public abstract class ComputerBluePrint {

	public abstract void setMainBoard();
	public abstract void setCpu();
	public abstract void setRam();
	public abstract void setVga();
	public abstract void setStorage();
	
	public abstract Computer getComputer();
	
}
