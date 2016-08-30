import adapter.MemberAdapter;
import system.target.UserInfo;
import system.vo.User;

public class Application {

	public static void main(String[] args) {
		
		UserInfo userInfoAdapter = new MemberAdapter();
		User user = userInfoAdapter.getUserInfo();
		
		System.out.println(user.getName());
		System.out.println(user.getBirthDate());
		System.out.println(user.getGender());
		System.out.println(user.getAddress());
		System.out.println(user.getPhoneNumber());
		
	}
	
}
