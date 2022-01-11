package eCommerceSimulation.business.abstracts;

import eCommerceSimulation.entities.concretes.User;

public interface UserCheckService {
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean checkEmail(User user);
	boolean checkPassword(User user);
	boolean uniqueMail(User user);
	boolean isValid(User user);
}
