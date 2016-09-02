package target;

import observer.OnClickListener;

public class Button {

	private OnClickListener onClickListener;
	private String name;

	public Button(String name) {
		this.name = name;
	}

	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}

	public String getName() {
		return name;
	}

	public void onClick() {
		onClickListener.onClick(this);
	}

}
