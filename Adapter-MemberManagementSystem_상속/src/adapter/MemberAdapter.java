package adapter;

import legacy.adaptee.MemberInfo;
import legacy.adaptee.vo.Member;
import system.target.UserInfo;
import system.vo.User;

public class MemberAdapter extends MemberInfo implements UserInfo {
	
	@Override
	public Member getMemberInfo() {
		return super.getMemberInfo();
	}

	@Override
	public User getUserInfo() {
		Member member = getMemberInfo();
		
		User user = new User();
		user.setAddress(member.getAddress());
		user.setName(member.getName());
		user.setPhoneNumber(member.getPhoneNumber());
		user.setBirthDate(member.getIdentityNumber().split("-")[0]);
		
		return user;
	}
	
}
