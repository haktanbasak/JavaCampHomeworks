package homework;
public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " giriþ yaptý");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " çýkýþ yaptý");
	}
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kayýt oldu");
	}
	
	public void multipleAdd(User[] users) {
		for(User user:users) {
			add(user);
		}
	}
}