package handler;

public abstract class Calculator {

	private Calculator next;
	
	public void setNext(Calculator next) {
		this.next = next;
	}
	
	public boolean compute(Request request) {

		if ( operator(request) ) {
			return true;
		}
		else  {
			if ( next != null ) {
				return next.compute(request);
			}
		}
		
		return false;

	}
	
	protected abstract boolean operator(Request request);
	
}
