package decorator.concrete;

import component.Aspect;
import decorator.AddProcess;

public class BeforeProcess extends AddProcess {

	public BeforeProcess(Aspect aspect) {
		super(aspect);
	}
	
	@Override
	public void before() {
		System.out.println("½ÇÇà Àü...");
	}
	
	@Override
	public void after() {}
	
	@Override
	public void error() {}

}
