package com.jav.hoang.TuTrainOOP;

public class NhanVien {
    private String maNV;
    private String hoTen;
    private Double luong;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }


    public NhanVien (String manv,String hoTen,Double luong){
        this.maNV = manv;
        this.hoTen= hoTen;
        this.luong = luong;
    }
    public double getThuNhap(){
           Double lcb = getLuong();
           return lcb;
    }
    public double getThueTN(){
          return 0;
    }
    public String xuatThongTin(){
        return "";
    }
}
