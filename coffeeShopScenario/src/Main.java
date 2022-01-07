import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MerniceServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager bcm = new StarbucksCustomerManager(new MerniceServiceAdapter());
		bcm.save(new Customer(1,"Haktan","Ba�ak",1996,1222222L)); //Do�ru T.C kimlik numaras� girildi�inde �al���yor
	}

}
