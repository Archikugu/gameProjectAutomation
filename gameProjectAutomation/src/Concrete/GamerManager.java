package Concrete;

import java.rmi.RemoteException;

import Abstract.IGamerCheckService;
import Abstract.IGamerService;
import Entities.Gamer;

public class GamerManager implements IGamerService {

	IGamerCheckService gamerCheckService;

	public GamerManager(IGamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void addGamer(Gamer gamer) throws NumberFormatException, RemoteException {
		if (gamerCheckService.CheckIfRealPlayer(gamer)) {
			System.out.println(gamer.getFirstName() + " The player has been successfully added to the system.");

		} else {
			System.out.println(" Player not found");
			removeGamer(gamer);
		}

	}

	@Override
	public void removeGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " The player has been successfully removed to the system.");
	}

	@Override
	public void updateGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " The player has been successfully updated to the system.");
	}

}
