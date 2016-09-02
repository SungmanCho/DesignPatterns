package decorator.concrete;

import component.Aspect;
import decorator.AddProcess;

public class MainProcess extends AddProcess {

	private ErrorProcess errorProcess;

	public MainProcess(Aspect aspect) {
		super(aspect);
	}

	public MainProcess(Aspect aspect, ErrorProcess errorProcess) {
		super(aspect);
		this.errorProcess = errorProcess;
	}

	@Override
	public void process() {
		try {
			System.out.println("실행해야 하는 메인 코드");
			Integer.parseInt("aa");
		} catch (Throwable t) {
			if ( errorProcess != null ) {
				errorProcess.process(t);
			}
			else {
				throw new RuntimeException(t);
			}
		}

		super.process();
	}
}
