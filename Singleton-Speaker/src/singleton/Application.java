package singleton;

public class Application {

	public static void main(String[] args) {
		
		Speaker speaker = Speaker.getInstance();
		speaker.volumeUp();
		speaker.volumeUp();
		speaker.volumeUp();
		speaker.volumeUp();
		speaker.volumeUp();
		speaker.volumeUp();
		speaker.volumeUp();
		
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		speaker.volumeDown();
		
	}
	
}
