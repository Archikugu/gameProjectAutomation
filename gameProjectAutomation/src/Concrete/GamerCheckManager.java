package Concrete;

import Abstract.IGamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements IGamerCheckService {

	@Override
	public boolean CheckIfRealPlayer(Gamer gamer) {
		return false;
	}

}
