package model;

public class MonHoc {
    private String maMH;
    private String tenMH;
    private int soTC;
    private String giangVien;
    private double hocphi;

    public MonHoc() {
    }

    public MonHoc(String maMH, String tenMH, int soTC, double hocphi, String giangVien) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
        this.hocphi = hocphi;
        this.giangVien = giangVien;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public double getHocphi() {
        return hocphi;
    }

    public void setHocphi(double hocphi) {
        this.hocphi = hocphi;
    }
    
    public String getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(String giangVien) {
        this.giangVien = giangVien;
    }
    
    
}
