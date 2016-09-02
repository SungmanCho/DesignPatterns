import component.Aspect;
import component.concrete.Rule;
import decorator.concrete.AfterProcess;
import decorator.concrete.BeforeProcess;
import decorator.concrete.ErrorProcess;
import decorator.concrete.MainProcess;

public class Main {

	public static void main(String[] args) {
		Aspect aspect = new Rule();
		
		
		aspect = new BeforeProcess(
					new MainProcess(new AfterProcess(aspect), new ErrorProcess())
				);
		
		aspect.process();
		
	}
	
}
