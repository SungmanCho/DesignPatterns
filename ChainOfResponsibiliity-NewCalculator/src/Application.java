import calculators.AdditionCalculator;
import calculators.DivisionCalculator;
import calculators.MultiplicationCalculator;
import calculators.SubtractionCalculator;
import handler.Calculator;
import handler.Request;

public class Application {

	public static void main(String[] args) {
		
		Calculator add = new AdditionCalculator();
		Calculator sub = new SubtractionCalculator();
		Calculator mul = new MultiplicationCalculator();
		Calculator div = new DivisionCalculator();
		
		add.setNext(sub);
		sub.setNext(mul);
		mul.setNext(div);
		
		Request request = new Request(10, 5, "*");
		
		add.compute(request);
		
	}
	
}
