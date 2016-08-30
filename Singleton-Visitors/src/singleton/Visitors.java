package singleton;

import java.util.ArrayList;
import java.util.List;

public class Visitors {

	private static Visitors instance;
	private List<String> visitors;
	
	private Visitors() {
		visitors = new ArrayList<String>();
	}
	
	public static Visitors getInstance() {
		if ( instance == null ) {
			instance = new Visitors();
		}
		return instance;
	}
	
	public void addVisitor( String visitor ) {
		if ( isNewVisitor(visitor) ) {
			visitors.add(visitor);
		}
	}
	
	private boolean isNewVisitor( String visitor ) {
		return !visitors.contains(visitor);
	}
	
	public List<String> getAllVisitors() {
		return visitors;
	}
	
	public int getAllVisitorsCount() {
		return visitors.size();
	}
	
}
