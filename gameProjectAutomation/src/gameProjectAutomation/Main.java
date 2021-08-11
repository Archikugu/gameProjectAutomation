package gameProjectAutomation;

import java.rmi.RemoteException;
import java.time.LocalDate;

import Abstract.IGamerCheckService;
import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		Gamer gamer1=new Gamer(1, "Gokhan", "Gok", "12345678910", 1999);
		
		Game game1= new Game(1, "CsGo ",75, "Ý7 gtx1050 display card ", 5);
		
		Campaign campaign1 = new Campaign(1, "Big Holiday", 30, LocalDate.of(2021, 8, 11), LocalDate.of(2021, 8, 18));
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.addGamer(gamer1);
		
		GameManager gameManager = new GameManager();	
		gameManager.addGame(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign1);
		
		IGamerCheckService gamerCheckService = new MernisServiceAdapter();
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		if (gamerCheckService.CheckIfRealPlayer(gamer1)==true) {
			gameSaleManager.sell(gamer1, game1, campaign1);
				
		} else {
			System.out.println("user not found and game sale failed");

		}
		
		
		
	}

}
