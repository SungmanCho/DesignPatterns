package visitor;

import visitable.Student;
import visitable.Visitable;

public class StudentVisitor implements Visitor {

	private int totalScore;
	
	@Override
	public void visit(Visitable visitable) {
		
		if ( visitable instanceof Student ) {
			totalScore += ((Student) visitable).getScore();
		}
		
	}
	
	public int getTotalScore() {
		return totalScore;
	}

}
