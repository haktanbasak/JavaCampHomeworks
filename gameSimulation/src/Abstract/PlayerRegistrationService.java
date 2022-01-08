package Abstract;

import java.rmi.RemoteException;

import Entities.Player;

public interface PlayerRegistrationService {
	void addPlayer(Player player) throws RemoteException;
	void deletePlayer(Player player);
	void updatePlayer(Player player);
}
