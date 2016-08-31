import builder.concrete.ComputerBuilder;
import product.Computer;

public class Application {

	public static void main(String[] args) {
		
		Computer computer = ComputerBuilder.start()
								.setCpu()
								.setMainBoard()
								.setRam()
								.setStorage()
								.setVga()
								.build();
		
		System.out.println(computer.getCpu());
		
	}
	
}
