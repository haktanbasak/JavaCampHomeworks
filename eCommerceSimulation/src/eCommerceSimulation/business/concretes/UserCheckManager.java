package eCommerceSimulation.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceSimulation.business.abstracts.UserCheckService;
import eCommerceSimulation.entities.concretes.User;

public class UserCheckManager implements UserCheckService{
	
	List<String> listOfEmail = new ArrayList<String>();
	
	@Override
	public boolean checkFirstName(User user) {
		if(user.getFirstName().isEmpty()) {
			System.out.println("İsim alanı boş olamaz.");
			return false;
		}
		else {
			if(user.getFirstName().length() < 3) {
				System.out.println("İsim 2 harften az olamaz");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().isEmpty()) {
			System.out.println("Soyisim alanı boş olamaz.");
			return false;
		}
		else {
			if(user.getFirstName().length() < 3) {
				System.out.println("Soysim 2 harften az olamaz");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkEmail(User user) {
		Pattern regexEmail = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
		Matcher matcher = regexEmail.matcher(user.getEmail());
		
		if(matcher.matches()){
			System.out.println("Email formatı uygun");
			
			return true;
		}
		else 
		{
			System.out.println("Email uygun değildir!");
			return false;
		}
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length() >=6) {
			System.out.println("Şifre uygun");
			return true;
		}
		else {
			System.out.println("Şifre en az 6 karakterden oluşmalıdır");
		}
		return false;
	}

	@Override
	public boolean uniqueMail(User user) {
		boolean result = true;
		if(listOfEmail.contains(user.getEmail())) {
			System.out.println("Bu email adresi ile daha önce kayıt yapılmış. Lütfen farklı bir mail deneyiniz");
			return false;
		}
		else {
			result = true;
			listOfEmail.add(user.getEmail());
		}
		return result;
	}

	@Override
	public boolean isValid(User user) {
		if(checkFirstName(user) && checkLastName(user) && checkEmail(user) && checkPassword(user) && uniqueMail(user) == true)  {
			return true;
		}
		return false;
	}

}
