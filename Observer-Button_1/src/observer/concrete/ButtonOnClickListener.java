package observer.concrete;

import observer.OnClickListener;
import target.Button;

public class ButtonOnClickListener implements OnClickListener {

	@Override
	public void onClick(Button button) {
		System.out.println(button.getName() + " 버튼을 클릭했습니다!");
	}

}
