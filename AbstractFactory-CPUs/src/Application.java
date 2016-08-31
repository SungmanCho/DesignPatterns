import factory.CpuFactory;
import factory.concrete.DualCoreCpuFactory;
import product.AmdCpu;

public class Application {

	public static void main(String[] args) {
		
		CpuFactory factory = new DualCoreCpuFactory();
		AmdCpu cpu = factory.createAmdCpu();
		System.out.println(cpu.getModelName());
		
	}
	
}
