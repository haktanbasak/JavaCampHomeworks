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
			System.out.println(game.getGameName() + " oyununa " + campaign.getCampaignName() + " kampanyas� ile " + " % " + campaign.getDiscount() + " indirim yap�lm��t�r.");
			System.out.println(game.getGameName() + " �r�n�n�n yeni fiyat�: " + newPrice);
		}
		else {
			System.out.println(game.getGameName() + " oyununun fiyat� " + game.getGamePrice() + " tl");

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
