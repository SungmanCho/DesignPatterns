import adapter.DoubleAdapter;
import legacy.adaptee.DoubleCalculator;
import system.target.FloatCalculator;

public class Client {

	public static void main(String[] args) {
		
		FloatCalculator calculator = new DoubleAdapter(new DoubleCalculator());
		System.out.println(calculator.getHalf(50));
		System.out.println(calculator.getDouble(50));
		
	}
	
}
