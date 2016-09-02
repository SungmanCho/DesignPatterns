package composite;

import java.util.ArrayList;
import java.util.List;

import component.Component;

public class Folder extends Component {

	private List<Component> components;
	
	public Folder(String name) {
		super(name);
		components = new ArrayList<Component>();
	}
	
	public void add(Component component) {
		components.add(component);
	}
	
	public void remove(Component component) {
		components.remove(component);
	}
	
	public List<Component> getChildren() {
		return components;
	}
	

}
