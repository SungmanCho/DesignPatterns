import abstraction.PrintMorseCode;
import implementor.concrete.LightMorseCode;

public class Application {
	public static void main(String[] args) {
		PrintMorseCode code = new PrintMorseCode(new LightMorseCode());
		code.j().a().n().g();
	}
}
