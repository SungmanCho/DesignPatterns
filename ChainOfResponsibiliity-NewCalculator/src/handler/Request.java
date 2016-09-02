package handler;

public class Request {

	private int numberOne;
	private int numberTwo;
	private String oper;

	public Request(int numberOne, int numberTwo, String oper) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.oper = oper;
	}

	public int getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}

	public int getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}

	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

}
