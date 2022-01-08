package Concrete;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Abstract.PlayerRegistrationService;
import Entities.Player;

public class PlayerRegistrationManager implements PlayerRegistrationService {
	private PlayerCheckService playerCheckService;
	
	public PlayerRegistrationManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void addPlayer(Player player) throws RemoteException {
		if(playerCheckService.checkIfRealPerson(player)) {
			System.out.println(player.getFirstName() + " " + player.getLastName() + " kay�t oldu.");
		}
		else {
			System.out.println("Kay�t ger�ekle�tirelemiyor.");
		}
	}

	@Override
	public void deletePlayer(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncunun kayd� silindi.");		
	}

	@Override
	public void updatePlayer(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncunun kayd� g�ncellendi.");
	}
	
}
