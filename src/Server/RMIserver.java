package Server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import Interface.ComShop;

public class RMIserver { //calvin and Osamah
    public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(8819);

            ComShop comS = new ComShop_Impl();
			Naming.rebind("//127.0.0.1:8819/COMP-SERVER", comS);

			System.out.println("remote service has registered and started successfully, waiting for client connection....");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}

