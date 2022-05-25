package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import Classes.Items;
import Classes.User;
import Classes.role_project;
import Interface.ComShop;

public class ComShop_Impl extends UnicastRemoteObject implements ComShop{
    //role_project roles = new role_project("Admin","Sales Executive","Supplier","Customer");
    role_project admin = new role_project("Admin");
    role_project saleE = new role_project("Sales Executive");
    role_project supp = new role_project("Supplier");
    role_project customer = new role_project("Customer");

    User user1 = new User("U1","Calvin", "Hermawan", "1234", admin);
    User user2 = new User("U2","Osamah", "2", "1234", saleE);

    Items item1 = new Items("CPU", "I1", 20.00, 5);
    Items item2 = new Items("GPU", "I2", 20.00, 4);
    protected ComShop_Impl() throws RemoteException {
        super();
        
    }
    
    @Override
    public boolean userCheck(String userName) throws RemoteException {
        // TODO Auto-generated method stub
        if (userName == user1.getUserName()||userName== user2.getUserName()){
            return true;
            
        }
        return false;
    }

    @Override
    public User userlogin(String userName, String passNum) throws RemoteException {
        // TODO Auto-generated method stub
        if (userName== user1.getUserName()&& passNum == user1.getPassNum()){
            return user1;
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
        // TODO Auto-generated method stub
        return false;
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

    @Override
    public boolean updateUser(User user) throws RemoteException {
        // TODO Auto-generated method stub
        return false;
    }
    
}
