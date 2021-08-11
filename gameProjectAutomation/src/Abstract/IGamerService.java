package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface IGamerService {
	
	void addGamer(Gamer gamer) throws NumberFormatException, RemoteException;
	void removeGamer(Gamer gamer);
	void updateGamer(Gamer gamer);

}
