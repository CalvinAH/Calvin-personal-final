package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import Classes.Items;
import Classes.User;

//comshop
public interface ComShop extends Remote{
    boolean userCheck(String userName) throws RemoteException; 
    User userlogin(String userName, String passNum) throws RemoteException;
    boolean regiserRole(User role) throws RemoteException; //ignore
    boolean deleteUser(String userName) throws RemoteException;
    boolean updateUser(User user) throws RemoteException;
    List<Items> getitems() throws RemoteException;
    boolean addItems(Items items) throws RemoteException;
    boolean deleteItems(String iid) throws RemoteException;
    List<Items>UpdateItems() throws RemoteException; //ignore
}
//public interface CalculatorInterface extends Remote{
// 	int calculate(int x,int y) throws RemoteException;
// }