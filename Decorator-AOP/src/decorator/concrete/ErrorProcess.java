package decorator.concrete;

import component.Aspect;
import decorator.AddProcess;

public class ErrorProcess extends AddProcess {

	public ErrorProcess(Aspect aspect) {
		super(aspect);
	}
	
	@Override
	public void before() {}
	
	@Override
	public void after() {}
	
	@Override
	public void error() {
		System.out.println("¿¡·¯³µ´Ù!!");
	}

}
