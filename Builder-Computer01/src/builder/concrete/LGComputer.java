package builder.concrete;

import builder.ComputerBluePrint;
import product.Computer;

public class LGComputer extends ComputerBluePrint {

	private Computer computer;
	
	public LGComputer() {
		this.computer = new Computer();
	}
	
	@Override
	public void setMainBoard() {
		computer.setMainBoard("Gigabyte");
	}

	@Override
	public void setCpu() {
		computer.setCpu("Intel i5");
	}

	@Override
	public void setRam() {
		computer.setRam("Samsung DDR3 8GB");
	}

	@Override
	public void setVga() {
		computer.setVga("NVidia GTX-960");
	}

	@Override
	public void setStorage() {
		computer.setStorage("WD HDD 1TB");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

	
	
}
