package decorator.concrete;

import component.Aspect;
import decorator.AddProcess;

public class AfterProcess extends AddProcess {

	public AfterProcess(Aspect aspect) {
		super(aspect);
	}
	
	@Override
	public void process() {
		System.out.println("½ÇÇà ÈÄ...");
		super.process();
	}
	
}
