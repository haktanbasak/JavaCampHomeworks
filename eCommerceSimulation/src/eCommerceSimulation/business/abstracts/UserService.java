package eCommerceSimulation.business.abstracts;

import eCommerceSimulation.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(User user);
}
