package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService {
	double newPrice;
	@Override
	public void addCampaign(Campaign campaign, Game game) {
		if(campaign.isThereCampaign()) {
			newPrice = game.getGamePrice() - (game.getGamePrice()*campaign.getDiscount()/100);
			System.out.println(game.getGameName() + " oyununa " + campaign.getCampaignName() + " kampanyasý ile " + " % " + campaign.getDiscount() + " indirim yapýlmýþtýr.");
			System.out.println(game.getGameName() + " ürününün yeni fiyatý: " + newPrice);
		}
		else {
			System.out.println(game.getGameName() + " oyununun fiyatý " + game.getGamePrice() + " tl");

		}
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

}
