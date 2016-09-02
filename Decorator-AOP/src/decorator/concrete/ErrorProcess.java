package decorator.concrete;

public class ErrorProcess {

	public void process(Throwable t) {
		System.out.println(t.getMessage());
		System.out.println("¿¡·¯³µ´Ù!!");
	}

}
