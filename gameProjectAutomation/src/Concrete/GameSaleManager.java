package Concrete;

import Abstract.IGameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameSaleManager implements IGameSaleService{

	@Override
	public void sell(Gamer gamer, Game game, Campaign campaign) {
		
		double gamePrice = game.getGamePrice() -(game.getGamePrice() * campaign.getCampaignDiscount()/100);
		
		System.out.println(gamer.getFirstName()+ ": player named"+game.getGameName()+" bought the game"+gamePrice);

		
	}

}
