package controller;


public class SinhVienDAO {
    public boolean checkLogin(String userName, String passWord){
        if(userName == "B17DCCN685" && passWord == "123abc"){
            return true;
        }
        return false;
    }
}
