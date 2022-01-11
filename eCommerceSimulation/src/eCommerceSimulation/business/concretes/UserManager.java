package eCommerceSimulation.business.concretes;

import eCommerceSimulation.business.abstracts.UserCheckService;
import eCommerceSimulation.business.abstracts.UserService;
import eCommerceSimulation.business.abstracts.VerificationService;
import eCommerceSimulation.core.GoogleService;
import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserCheckService userCheckService;
	private VerificationService verificationService;
	private UserDao userDao;
	private GoogleService googleService;
	
	public UserManager(UserCheckService userCheckService, VerificationService verificationService, UserDao userDao,GoogleService googleService) {
		super();
		this.userCheckService = userCheckService;
		this.verificationService = verificationService;
		this.userDao = userDao;
		this.googleService = googleService;
	}

	@Override
	public void signUp(User user) {
		if(userCheckService.isValid(user) == true){
			System.out.println(user.getFirstName() + " kullanıcısı başarı ile eklendi");
			verificationService.sendToVerifyMail(user.getEmail());
			userDao.add(user);
			googleService.signUpToSystem("Kullanıcı Google hesabı ile kayıt oldu");
		}
	}

	@Override
	public void signIn(User user) {
		verificationService.verifyMail(user.getEmail());
		
		if(userDao.getEmail(user.getEmail()) && userDao.getPassword(user.getPassword()) && verificationService.checkVerifyAccount(user.getEmail()) == false) {
			System.out.println("Kullanıcı başarı ile giriş yaptı");
		}
		else if(verificationService.checkVerifyAccount(user.getEmail()) == false){
			System.out.println("Mail adresi doğrulanmadığı için giriş yapılamıyor");
		}
		else {
			System.out.println("Kullanıcı bilgileri yanlış");
		}
	}

}
