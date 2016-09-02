package decorator.concrete;

import component.Aspect;
import decorator.AddProcess;

public class BeforeProcess extends AddProcess {

	public BeforeProcess(Aspect aspect) {
		super(aspect);
	}
	
	@Override
	public void process() {
		System.out.println("½ÇÇà Àü...");
		super.process();
	}
	
}
