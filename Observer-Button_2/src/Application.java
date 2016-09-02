import java.util.Observable;
import java.util.Observer;

import target.Button;

public class Application {

	public static void main(String[] args) {
		
		Button button = new Button("Test");
		button.addObserver(new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				System.out.println(button.getName() + " 버튼을 클릭했습니다!");
			}
		});
		
		button.onClick();
		
	}
	
}
