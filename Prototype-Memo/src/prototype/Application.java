package prototype;

public class Application {

	public static void main(String[] args) {
		
		Memo memo = new Memo();
		memo.writeMemo("æ»≥Á«œººø‰");
		
		try {
			Memo cloneMemo = (Memo) memo.clone();
			cloneMemo.writeMemo("π›∞©Ω¿¥œ¥Ÿ.");
			
			memo.printMemo();
			cloneMemo.printMemo();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
