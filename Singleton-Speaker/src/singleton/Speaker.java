package singleton;

public class Speaker {

	private final static int MAX_VOLUME = 100;
	private final static int MIN_VOLUME = 0;
	private final static int DEFAULT_VOLUME = 50;
	
	private static Speaker instance;
	private int volume;

	private Speaker() {
		volume = DEFAULT_VOLUME;
		printVolume();
	}
	
	public static Speaker getInstance() {
		if ( instance == null ) {
			instance = new Speaker();
		}
		return instance;
	}
	
	public void volumeUp() {
		volume+=10;
		if ( volume >= MAX_VOLUME ) {
			volume = MAX_VOLUME;
		}
		
		printVolume();
	}
	
	public void volumeDown() {
		volume-=10;
		if ( volume <= MIN_VOLUME ) {
			volume = MIN_VOLUME;
		}
		
		printVolume();
	}
	
	private void printVolume() {
		System.out.println("ÇöÀç º¼·ý : " + volume);
	}
	
}
