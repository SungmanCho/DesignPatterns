import observer.concrete.ButtonOnClickListener;
import target.Button;

public class Application {

	public static void main(String[] args) {
		
		Button button = new Button("Test");
		button.setOnClickListener(new ButtonOnClickListener());
		
		button.onClick();
		
	}
	
}
