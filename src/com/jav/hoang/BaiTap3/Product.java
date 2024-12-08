package com.jav.hoang.BaiTap3;

public abstract class Product {
    private int id;

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    private double gia;
    private String loaiSP;
    public Product(int id,double gia,String loaiSP){
        this.id = id ;
        this.gia = gia;
        this.loaiSP = loaiSP;

    }
    public abstract double tinhGiaTien();

    public abstract String displayInfo();

    public abstract ProductCategory getProductCategory();

}


