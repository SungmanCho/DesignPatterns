package singleton;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Visitors visitors = Visitors.getInstance();
		visitors.addVisitor("방문자1");
		visitors.addVisitor("방문자2");
		visitors.addVisitor("방문자3");
		
		System.out.println(visitors.getAllVisitorsCount());
		
		Visitors visitors2 = Visitors.getInstance();
		visitors.addVisitor("방문자4");
		visitors.addVisitor("방문자5");
		visitors.addVisitor("방문자6");
		visitors.addVisitor("방문자7");
		System.out.println(visitors2.getAllVisitorsCount());
		System.out.println(visitors.getAllVisitorsCount());
		
		List<String> visitorList = visitors2.getAllVisitors();
		for (String visitor : visitorList) {
			System.out.println(visitor);
		}
		
	}
	
}
