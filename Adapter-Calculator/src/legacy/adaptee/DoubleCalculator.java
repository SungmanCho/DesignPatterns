package legacy.adaptee;


/**
 * 수정 불가능한 클래스
 * @author mcjan
 *
 */
public class DoubleCalculator {

	public double getHalf(int number) {
		return number / 2.0;
	}
	
	public double getDouble(int number) {
		return number * 2.0;
	}
	
}
