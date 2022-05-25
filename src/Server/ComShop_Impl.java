package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import Classes.Items;
import Classes.User;
import Interface.ComShop;

public class ComShop_Impl extends UnicastRemoteObject implements ComShop{

    protected ComShop_Impl() throws RemoteException {
        super();
        
    }

    @Override
    public boolean userCheck(String userName) throws RemoteException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public User userlogin(String userName, String passNum) throws RemoteException {
        // TODO Auto-generated method stub
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

    @Override
    public boolean updateUser(String userName) throws RemoteException {
        // TODO Auto-generated method stub
        return false;
    }

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
