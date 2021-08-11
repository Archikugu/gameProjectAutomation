package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface IGamerCheckService {

	boolean CheckIfRealPlayer(Gamer gamer) throws NumberFormatException, RemoteException;

}
