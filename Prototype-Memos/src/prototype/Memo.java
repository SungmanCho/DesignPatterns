package prototype;

import java.util.ArrayList;
import java.util.List;

public class Memo implements Cloneable {

	private List<String> memos;
	
	public Memo() {
		memos = new ArrayList<String>();
	}
	
	public void writeMemo(String memo) {
		this.memos.add(memo);
	}
	
	public void printMemo() {
		for (String memo : memos) {
			System.out.println(memo);
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Memo memo = (Memo) super.clone();
		memo.memos = new ArrayList<String>();
		memo.memos.addAll(this.memos);
		
		return memo;
	}
	
}
