package builder.concrete;

import builder.ComputerBluePrint;
import product.Computer;

public class SamsungComputer extends ComputerBluePrint {

	private Computer computer;
	
	public SamsungComputer() {
		this.computer = new Computer();
	}
	
	@Override
	public void setMainBoard() {
		computer.setMainBoard("ACER");
	}

	@Override
	public void setCpu() {
		computer.setCpu("AMD ºÒµµÀú");
	}

	@Override
	public void setRam() {
		computer.setRam("Samsung DDR4 16GB");
	}

	@Override
	public void setVga() {
		computer.setVga("Radeon 5600");
	}

	@Override
	public void setStorage() {
		computer.setStorage("WD SSD 1TB");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

	
	
}
