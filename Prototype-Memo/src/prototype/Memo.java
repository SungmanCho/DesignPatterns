package prototype;

public class Memo implements Cloneable {

	private String memo;
	
	public void writeMemo(String memo) {
		this.memo = memo;
	}
	
	public void printMemo() {
		System.out.println(memo);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
