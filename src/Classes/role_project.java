package Classes;
public class role_project{ //calvin's
    private String role;
    private String role1;
    private String role2;
    private String role3;
    private String role4;

    public role_project(String role){
        this.role = role;
    }
    public role_project(String role1, String role2, String role3, String role4){
        this.role1 = role1;
        this.role2 =role2;
        this.role3 = role3;
        this.role4 = role4;
    }
    public role_project(){}
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole1() {
        return role1;
    }

    public void setRole1(String role1) {
        this.role1 = role1;
    }

    public String getRole2() {
        return role2;
    }

    public void setRole2(String role2) {
        this.role2 = role2;
    }

    public String getRole3() {
        return role3;
    }

    public void setRole3(String role3) {
        this.role3 = role3;
    }

    public String getRole4() {
        return role4;
    }

    public void setRole4(String role4) {
        this.role4 = role4;
    }
}
