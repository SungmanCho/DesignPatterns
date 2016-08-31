import builder.concrete.SamsungComputer;
import director.ComputerFactory;
import product.Computer;

public class Application {

	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory(new SamsungComputer());
		
		factory.make();
		
		Computer computer = factory.get();
		System.out.println(computer.getMainBoard());
		
	}
	
}
