package target;

import java.util.Observable;

public class Button extends Observable {

	private String name;

	public Button(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void onClick() {
		setChanged();
		notifyObservers();
	}

}
