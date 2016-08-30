import adapter.MemberAdapter;
import legacy.adaptee.MemberInfo;
import system.target.UserInfo;
import system.vo.User;

public class Application {

	public static void main(String[] args) {
		
		UserInfo userInfoAdapter = new MemberAdapter(new MemberInfo());
		User user = userInfoAdapter.getUserInfo();
		
		System.out.println(user.getName());
		System.out.println(user.getBirthDate());
		System.out.println(user.getGender());
		System.out.println(user.getAddress());
		System.out.println(user.getPhoneNumber());
		
	}
	
}
