package eCommerceSimulation;

import eCommerceSimulation.business.concretes.MailVerificationManager;
import eCommerceSimulation.business.concretes.UserCheckManager;
import eCommerceSimulation.business.concretes.UserManager;
import eCommerceSimulation.business.abstracts.UserService;
import eCommerceSimulation.core.SignUpWithGoogleAccountAdapter;
import eCommerceSimulation.dataAccess.concretes.HibernateUserDao;
import eCommerceSimulation.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Haktan","Başak","haktanbasak@hotmail.com","124547");
		
		UserService service = new UserManager(new UserCheckManager(), new MailVerificationManager(),new HibernateUserDao(),new SignUpWithGoogleAccountAdapter());
		
		service.signUp(user1);
		
	}

}
