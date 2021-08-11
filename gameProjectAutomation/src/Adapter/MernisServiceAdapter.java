package Adapter;

import java.rmi.RemoteException;

import Abstract.IGamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IGamerCheckService{
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealPlayer(Gamer gamer) throws NumberFormatException, RemoteException {
		boolean result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalIdentity()),gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getDateOfBirth());
		
		if (result == true) {
			System.out.println("Successful");
			return true;
			
		} else {
			System.out.println("Unsuccessful");
			return false;

		}
	}

}
