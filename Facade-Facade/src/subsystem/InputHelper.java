package subsystem;

import java.util.Scanner;

class InputHelper {

	private Scanner scanner;
	
	public InputHelper() {
		scanner = new Scanner(System.in);
	}
	
	public String getString() {
		
		String text = "";
		
		while ( text == null || text.length() == 0 ) {
			System.out.println("텍스트를 입력하세요.");
			text = scanner.nextLine();
		}
		
		return text;
		
	}
	
}
