
import java.rmi.RemoteException;
import java.util.Scanner;

import Classes.Items;
import Classes.User;
import Classes.role_project;


///test app made for testing purposes only


public class app {
    static role_project admin = new role_project("Admin");
    static role_project saleE = new role_project("Sales Executive");
    static role_project supp = new role_project("Supplier");
    static role_project customer = new role_project("Customer");

    static User user1 = new User("U1","Calvin", "1", "1234", admin);
    static User user2 = new User("U2","Osamah", "2", "1234", saleE);

    Items item1 = new Items("CPU", "I16", 250.00, 5);
    Items item2 = new Items("GPU", "I20", 203.00, 4);
    Items item3 = new Items("Laptop","I01", 1240.5, 0);
    Items item4 = new Items("Mobile","I02", 240.1, 0);
    Items item5 = new Items("Power Charger","I03", 240.1, 0);
    Items item6 = new Items("MoterBike","I04", 38000.24, 0);
    public static void main(String[] args) {
		try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for user check, 2 to log in");
            int choice1st = sc.nextInt();
            while (choice1st != 1 && choice1st != 2){
                System.out.println("ERROR! Enter 1 for user check, 2 to log in");
                choice1st = sc.nextInt();
            }
            if (choice1st ==1){
                System.out.println("Enter username: ");
                String userName = sc.next();
                System.out.println(" result is: "+userCheck(userName));
            }
            if(choice1st ==2){

            }
            sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
    public static boolean userCheck(String userName) throws RemoteException {
        if (userName == user1.getUserName()||userName== user2.getUserName()){
            return true;
            
        }
        return false;
    }
}

