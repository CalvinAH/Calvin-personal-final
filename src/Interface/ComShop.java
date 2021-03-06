package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import Classes.Items;
import Classes.User;


public interface ComShop extends Remote{
    boolean userCheck(String userName) throws RemoteException; 
    User userlogin(String userName, String passNum) throws RemoteException;
    boolean regiserRole(User role) throws RemoteException; //ignore
    boolean deleteUser(String userName) throws RemoteException;
    String updateUser(User user, String firstName, String lastName, String passNum) throws RemoteException;
    List<Items> getitems() throws RemoteException;
    boolean addItems(Items items) throws RemoteException;
    boolean deleteItems(String iid) throws RemoteException;
    List<Items>UpdateItems() throws RemoteException; //ignore
}
