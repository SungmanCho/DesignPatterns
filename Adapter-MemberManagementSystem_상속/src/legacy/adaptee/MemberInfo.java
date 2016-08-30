package legacy.adaptee;

import legacy.adaptee.vo.Member;

/**
 * 수정 불가능한 클래스
 * @author mcjan
 *
 */
public class MemberInfo {

	public Member getMemberInfo() {
		Member member = new Member();
		member.setName("아무개");
		member.setIdentityNumber("800101-1234567");
		member.setAddress("서울");
		member.setPhoneNumber("010-1234-5678");
		
		return member;
	}
	
}
