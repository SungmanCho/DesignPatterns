package decorator;

import component.Aspect;

public abstract class AddProcess implements Aspect {

	private Aspect aspect;
	
	public AddProcess(Aspect aspect) {
		this.aspect = aspect;
	}

	@Override
	public void before() {
		aspect.before();
	}

	@Override
	public void after() {
		aspect.after();
	}

	@Override
	public void error() {
		aspect.error();
	}
	
	@Override
	public void process() {
		this.before();
		
		try {
			aspect.process();
		}
		catch(Throwable t) {
			this.error();
		}
		
		this.after();
	}

}
