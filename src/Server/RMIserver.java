package Server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import Interface.ComShop;

public class RMIserver { //calvin and Osamah
    public static void main(String[] args) {
		try {
			// specify a port for RMI service
			LocateRegistry.createRegistry(8819);

			// This object instance can be obtained in client code
			//CalculatorInterface cal = new CalculatorImp();
            ComShop comS = new ComShop_Impl();
			// bind a URL to let clients obtain certain instances of objects
			Naming.rebind("//127.0.0.1:8819/COMP-SERVER", comS);

			System.out.println("remote service has registered and started successfully, waiting for client connection....");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}

