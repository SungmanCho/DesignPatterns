package subsystem;

class PrintHelper {

	private final String PRINT_FORMAT = "입력하신 글자는 %s 입니다.";
	
	public void printText(String message) {
		
		String formatString = String.format(PRINT_FORMAT, message);
		System.out.println(formatString);
		
	}
	
}
