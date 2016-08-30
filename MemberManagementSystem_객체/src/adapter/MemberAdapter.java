package adapter;

import legacy.adaptee.MemberInfo;
import legacy.adaptee.vo.Member;
import system.target.UserInfo;
import system.vo.User;

public class MemberAdapter implements UserInfo {
	
	private MemberInfo memberInfo;
	
	public MemberAdapter(MemberInfo memberInfo) {
		this.memberInfo = memberInfo;
	}

	@Override
	public User getUserInfo() {
		Member member = memberInfo.getMemberInfo();
		
		User user = new User();
		user.setAddress(member.getAddress());
		user.setName(member.getName());
		user.setPhoneNumber(member.getPhoneNumber());
		user.setBirthDate(member.getIdentityNumber().split("-")[0]);
		
		return user;
	}
	
}
