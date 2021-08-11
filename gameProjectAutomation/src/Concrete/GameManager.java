package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void addGame(Game game) {
		System.out.println(game.getGameName() + " The game has been successfully added to the system.");
	}

	@Override
	public void removeGame(Game game) {
		System.out.println(game.getGameName() + " The game has been successfully remove to the system.");
	}

	@Override
	public void updateGame(Game game) {

		System.out.println(game.getGameName() + " The game has been successfully uptadated to the system.");
	}

}
