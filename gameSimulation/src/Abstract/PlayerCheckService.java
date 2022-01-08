package Abstract;

import java.rmi.RemoteException;

import Entities.Player;

public interface PlayerCheckService {
	boolean checkIfRealPerson(Player player) throws RemoteException;
}
