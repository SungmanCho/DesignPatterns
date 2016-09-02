package visitable;

import visitor.Visitor;

public interface Visitable {

	public void accept(Visitor visitor);
	
}
