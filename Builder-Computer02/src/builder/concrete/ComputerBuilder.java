package builder.concrete;

import product.Computer;

public class ComputerBuilder {

	private Computer computer;
	
	private ComputerBuilder() {
		computer = new Computer();
	}
	
	public static ComputerBuilder start() {
		return new ComputerBuilder();
	}
	
	public ComputerBuilder setMainBoard() {
		computer.setMainBoard("Gigabyte");
		return this;
	}

	public ComputerBuilder setCpu() {
		computer.setCpu("Intel i5");
		return this;
	}

	public ComputerBuilder setRam() {
		computer.setRam("Samsung DDR3 8GB");
		return this;
	}

	public ComputerBuilder setVga() {
		computer.setVga("NVidia GTX-960");
		return this;
	}

	public ComputerBuilder setStorage() {
		computer.setStorage("WD HDD 1TB");
		return this;
	}
	
	public Computer build() {
		return computer;
	}
	
	
}
