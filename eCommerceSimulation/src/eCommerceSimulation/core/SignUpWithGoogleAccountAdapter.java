package eCommerceSimulation.core;

import eCommerceSimulation.googleAccount.SignUpWithGoogleAccount;

public class SignUpWithGoogleAccountAdapter implements GoogleService {

	@Override
	public void signUpToSystem(String message) {
		SignUpWithGoogleAccount account = new SignUpWithGoogleAccount();
		account.signUp(message);
		
	}

}
