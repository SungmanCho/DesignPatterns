package calculators;

import handler.Calculator;
import handler.Request;

public class MultiplicationCalculator extends Calculator {

	@Override
	protected boolean operator(Request request) {

		if (request.getOper().equals("*")) {

			int result = request.getNumberOne() * request.getNumberTwo();
			System.out.printf("%d * %d = %d\n", 
					request.getNumberOne(), request.getNumberTwo(), result);

			return true;
		}

		return false;
	}

}
