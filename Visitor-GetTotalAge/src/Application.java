import java.util.ArrayList;
import java.util.List;

import visitable.Student;
import visitable.Visitable;
import visitor.StudentVisitor;
import visitor.Visitor;

public class Application {

	public static void main(String[] args) {
		
		List<Visitable> students = new ArrayList<Visitable>();
		students.add(new Student(60));
		students.add(new Student(70));
		students.add(new Student(90));
		students.add(new Student(40));
		students.add(new Student(100));
		
		Visitor visitor = new StudentVisitor();
		
		for (Visitable visitable : students) {
			visitable.accept(visitor);
		}
		
		int totalScore = ((StudentVisitor) visitor).getTotalScore();
		System.out.println(totalScore);
		
	}
	
}
