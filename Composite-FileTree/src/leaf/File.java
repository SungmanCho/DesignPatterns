package leaf;

import component.Component;

public class File extends Component {

	private String data;

	public File(String name) {
		super(name);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
