package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceServiceAdapter implements CustomerCheckService {
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = client.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		} 
		catch (Exception e) {
			System.out.println("Baþarýsýz");
		}
		return result;
	}

}
