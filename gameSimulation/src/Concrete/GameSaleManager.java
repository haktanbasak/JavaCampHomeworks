package Concrete;

import Abstract.CampaignService;
import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSaleManager implements GameSaleService {
	private CampaignService campaignService;
	
	public GameSaleManager(CampaignService campaignService) {
		super();
		this.campaignService = campaignService;
	}
	
	@Override
	public void gameSell(Game game, Player player, Campaign campaign) {
		campaignService.addCampaign(campaign, game);
		System.out.println(player.getFirstName() + " " + player.getLastName() + " " + game.getGameName() + " oyununu satýn almýþtýr" );
	} 
}
