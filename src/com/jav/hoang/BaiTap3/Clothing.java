package com.jav.hoang.BaiTap3;

public class Clothing extends Product{
    public String getHangThoiTrang() {
        return hangThoiTrang;
    }

    public void setHangThoiTrang(String hangThoiTrang) {
        this.hangThoiTrang = hangThoiTrang;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    String hangThoiTrang;
    double size;
    public Clothing (int id,double gia,String loaiSP,String hangThoiTrang,double size){
        super(id,gia,loaiSP);
        this.hangThoiTrang= hangThoiTrang;
        this.size= size;

    }


    @Override
    public double tinhGiaTien() {
        return getGia() * getSize();
    }

    @Override
    public String displayInfo() {
        String display =  "{id : " +getId()+
                "gia : =" +super.getGia()+
                "loaiSP :" +super.getLoaiSP()+
                "kieuDang :'" + getHangThoiTrang() + '\'' +
                ", size : " + getSize() +
                "Type : " + getProductCategory().name()+
                '}';
        return display;
    }
    @Override
    public ProductCategory getProductCategory() {
        return ProductCategory.QUANAO;
    }
}
