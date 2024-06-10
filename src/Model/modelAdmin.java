package Model;
import Node.Admin;

public class modelAdmin {
    // composite
    Admin admin;

    public modelAdmin(){
        this.admin = new Admin();
    }
    public boolean cekAdmin(String user,String pw){
        return admin.getUsername().equals(user)&& admin.getPW().equals(pw);
    }

}
