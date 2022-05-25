package Client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import Interface.ComShop;

public class Client {
    public static void main(String[] args) {
		try {
			//String url = "//127.0.0.1:8819/SAMPLE-SERVER";
            String url = "//127.0.0.1:8819/COMP-SERVER";
            //127.0.0.1:8819/COMP-SERVER
			// obtain a object instance from a remote server
			//CalculatorInterface calculator =  (CalculatorInterface) Naming.lookup(url);
            ComShop comShop = (ComShop) Naming.lookup(url);
            System.out.println("has found a remote service successfully.");
			//System.out.println("get the result via RMI, and the result of 3+5 is: "+comShop.calculate(5, 3));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("The server hasn't been started or giving a wrong url in client code.");
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
