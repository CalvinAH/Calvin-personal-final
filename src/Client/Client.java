package Client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

import Classes.User;
import Interface.ComShop;

public class Client {
    public static void main(String[] args) {//victoria and sadab
		try {
            Scanner sc = new Scanner(System.in);
			//String url = "//127.0.0.1:8819/SAMPLE-SERVER";
            String url = "//127.0.0.1:8819/COMP-SERVER";
            //127.0.0.1:8819/COMP-SERVER
			// obtain a object instance from a remote server
			//CalculatorInterface calculator =  (CalculatorInterface) Naming.lookup(url);
            ComShop comShop = (ComShop) Naming.lookup(url);
            System.out.println("has found a remote service successfully.");
            System.out.println("Press 1 for check user, 2 for login: ");
            int firstC =sc.nextInt();
            if(firstC== 1){
                System.out.println("Enter username: ");
                String userName = sc.nextLine();
                System.out.println("get the result via RMI, and the result is: "+comShop.userCheck(userName));
            }
            if(firstC== 2){
                System.out.println("Enter username: ");
                String userName = sc.nextLine();
                System.out.println("Enter passport: ");
                String passNum = sc.nextLine();
                User currentUser = comShop.userlogin(userName, passNum);
                if (currentUser == null){
                    System.out.println("No user");
                }
                else{
                    System.out.println("Full name: "+currentUser.getFirstName()+" "+currentUser.getLastName());
                }
            }
            else{
                System.out.println("try again");
            }
            sc.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
			System.out.println("The server hasn't been started or giving a wrong url in client code.");
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}
