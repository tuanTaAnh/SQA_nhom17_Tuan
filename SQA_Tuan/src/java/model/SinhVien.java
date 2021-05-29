package model;

public class SinhVien {
    private String userName;
    private String passWord;
    private String msv;
    private String fullName;
    private String khoa;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String userName, String passWord, String msv, String fullName, String khoa, String lop) {
        this.userName = userName;
        this.passWord = passWord;
        this.msv = msv;
        this.fullName = fullName;
        this.khoa = khoa;
        this.lop = lop;
    }
    
    public SinhVien(String userName, String passWord){
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }  
}
