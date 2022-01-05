package homework;
public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " giri� yapt�");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " ��k�� yapt�");
	}
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kay�t oldu");
	}
	
	public void multipleAdd(User[] users) {
		for(User user:users) {
			add(user);
		}
	}
}