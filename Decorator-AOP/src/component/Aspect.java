package component;

public interface Aspect {

	public void process();
	
	public void before();
	public void after();
	public void error();
	
}
