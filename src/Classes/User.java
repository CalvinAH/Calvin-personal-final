package Classes;

import java.io.Serializable;

public class User  implements Serializable{//calvin's

    //private static final long serialVersionUID = 12351313554L; ///???
    private String firstName;
    private String lastName;
    private String userName;
    private String id; //user id
    private String passNum;

    private role_project role;
    private String role1;
    
    public User(String id){
        this.id = id;
    }
    
    public String getRole1() {
        return role1;
    }

    public void setRole1(String role1) {
        this.role1 = role1;
    }

    public User(String id,String firstName, String lastName, String passNum, role_project role) { //need role and or id
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName; 
        this.userName = firstName +lastName;
        this.passNum = passNum;
        this.role = role;
    }
    public User(String id,String firstName, String lastName, String passNum, String role0) { //need role and or id
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName; 
        this.userName = firstName +lastName;
        this.passNum = passNum;
        this.setRole1(role1);
    }
    public User() {
    }

    public String getId(){
        return id;
    }

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassNum() {
        return passNum;
    }

    public void setPassNum(String passNum) {
        this.passNum = passNum;
    }
    public role_project getRole() {
        return role;
    }

    public void setRole(role_project role) {
        this.role = role;

    }
}
