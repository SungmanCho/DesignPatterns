import component.IBeverage;
import component.concrete.Base;
import decorator.concrete.Espresso;
import decorator.concrete.Water;

public class Main {

	public static void main(String[] args) {
		IBeverage americano = new Base();
		americano = new Espresso(new Water(new Water(americano)));
		System.out.println(americano.getTotalPrice());
	}
	
}
