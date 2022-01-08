package Adapter;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService {
	public boolean confirm = false;

	KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();

	@Override
	public boolean checkIfRealPerson(Player player) throws RemoteException {
		boolean result = proxy.TCKimlikNoDogrula(player.getNationalityId(), player.getFirstName(), player.getLastName(), player.getDateOfBirth());

		if (result == true)
		{
			System.out.println("Oyuncu doğrulaması başarılı...");
			confirm = true;
			return true;
		}
		else
		{
			System.out.println("oyuncu doğrulaması başarısız...");
			confirm = false;
			return false;
		}
	}

}
