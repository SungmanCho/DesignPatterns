package visitable;

import visitor.Visitor;

public class Student implements Visitable {

	private int score;

	public Student(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	
	
}
