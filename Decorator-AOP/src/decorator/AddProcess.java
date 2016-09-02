package decorator;

import component.Aspect;
import decorator.concrete.AfterProcess;
import decorator.concrete.BeforeProcess;
import decorator.concrete.ErrorProcess;
import decorator.concrete.MainProcess;

public abstract class AddProcess implements Aspect {

	private Aspect aspect;

	public AddProcess(Aspect aspect) {
		this.aspect = aspect;
	}

	@Override
	public void process() {
		aspect.process();
//		if (aspect instanceof BeforeProcess) {
//			aspect.before();
//		}
//		
//		try {
//			if (aspect instanceof MainProcess) {
//				aspect.process();
//			}
//		} catch (Throwable t) {
//			aspect.error();
//		}
//
//		if (aspect instanceof AfterProcess) {
//			aspect.after();
//		}
	}

}
