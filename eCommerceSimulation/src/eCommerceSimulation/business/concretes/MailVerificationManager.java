package eCommerceSimulation.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSimulation.business.abstracts.VerificationService;

public class MailVerificationManager implements VerificationService {
	
	UserCheckManager userCheckManager;
	
	List<String> verificatedEmail = new ArrayList<String>();
	
	@Override
	public void sendToVerifyMail(String email) {
		System.out.println(email + " kullanıcısına doğrulama maili gönderildi");
		
	}

	@Override
	public void verifyMail(String email) {
		verificatedEmail.add(email);
		System.out.println(email + " başarıyla doğrulandı");
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		if(verificatedEmail.contains(email)) {
			return true;
		}
		return false;
	}

}
