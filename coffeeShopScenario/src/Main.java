import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MerniceServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager bcm = new StarbucksCustomerManager(new MerniceServiceAdapter());
		bcm.save(new Customer(1,"Haktan","Baþak",1996,1222222L)); //Doðru T.C kimlik numarasý girildiðinde çalýþýyor
	}

}
