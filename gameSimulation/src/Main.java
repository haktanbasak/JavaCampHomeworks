import java.rmi.RemoteException;

import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameSaleManager;
import Concrete.PlayerRegistrationManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) throws RemoteException {
		Campaign campaign = new Campaign(1,"Black Friday",15,true);
		Game game = new Game(1,"Fifa 22",100);
		Player player = new Player(1,"Haktan","Baþak",1996,111111111111L);
		
		PlayerRegistrationManager prm = new PlayerRegistrationManager(new MernisServiceAdapter());
		prm.addPlayer(player);
		GameSaleManager gsm = new GameSaleManager(new CampaignManager());
		gsm.gameSell(game, player, campaign);
	}

}
