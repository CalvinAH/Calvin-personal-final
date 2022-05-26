package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import Classes.Items;
import Classes.User;
import Classes.role_project;
import Interface.ComShop;

public class ComShop_Impl extends UnicastRemoteObject implements ComShop{
    role_project admin = new role_project("Admin");
    role_project saleE = new role_project("Sales Executive");
    role_project supp = new role_project("Supplier");
    role_project customer = new role_project("Customer");

    User user1 = new User("U1","Calvin", "1", "1234", admin);
    User user2 = new User("U2","Osamah", "2", "1234", saleE);

    Items item1 = new Items("CPU", "I16", 250.00, 5);
    Items item2 = new Items("GPU", "I20", 203.00, 4);
    Items item3 = new Items("Laptop","I01", 1240.5, 0);
    Items item4 = new Items("Mobile","I02", 240.1, 0);
    Items item5 = new Items("Power Charger","I03", 240.1, 0);
    Items item6 = new Items("MoterBike","I04", 38000.24, 0);
    protected ComShop_Impl() throws RemoteException {
        super();
        
    }
    
    @Override
    public boolean userCheck(String userName) throws RemoteException {
        if (userName == user1.getUserName()||userName== user2.getUserName()){
            return true;
            
        }
        return false;
    }

    @Override
    public User userlogin(String userName, String passNum) throws RemoteException {
        if (userName== user1.getUserName()&& passNum == user1.getPassNum()){
            return user1;
        }
        if (userName== user2.getUserName()&& passNum == user2.getPassNum()){
            return user2;
        }
        return null;
    }

    @Override
    public boolean regiserRole(User role) throws RemoteException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deleteUser(String userName) throws RemoteException {
        if (userName == user1.getUserName()){
            user1=null;
            return true;
        }
        if (userName == user2.getUserName()){
            user2=null;
            return true;
        }
        return false;
    }

    @Override
    public String updateUser(User user,String firstName, String lastName, String passNum) throws RemoteException {
        if(user == user1){
            User user1 = new User("U1",firstName, lastName, passNum, admin);
            return("New user info: "+ user1.getUserName()+"\t Passport "+user1.getPassNum());
        }
        if(user == user2){
            User user2 = new User("U2",firstName, lastName, passNum, saleE);
            return("New user info: "+ user2.getUserName()+"\t Passport "+user2.getPassNum());
        }
        return("Error");
    }
    // @Override
    // public boolean updateUser(String userName) throws RemoteException {
    //     // TODO Auto-generated method stub
    //     return false;
    // }

    @Override
    public List<Items> getitems() throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean addItems(Items items) throws RemoteException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deleteItems(String iid) throws RemoteException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Items> UpdateItems() throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    
    
}
