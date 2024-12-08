package com.jav.hoang.BaiTap3;

public class Electronics extends Product {
    String kieuDang;

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    int soLuong;

    public String getKieuDang() {
        return kieuDang;
    }

    public void setKieuDang(String kieuDang) {
        this.kieuDang = kieuDang;
    }


    public Electronics(int id,double gia,String loaiSP ,String kieuDang,int soLuong ){
        super(id, gia, loaiSP);
        this.kieuDang = kieuDang;
        this.soLuong = soLuong;

    }

    @Override
    public double tinhGiaTien() {
        double tongTien = getGia()*getSoLuong();
        return tongTien;
    }



    @Override
    public String displayInfo() {
        String display =  "{id" +getId()+
                "gia = " + super.getGia()+
                "loaiSP " + super.getLoaiSP()+
                "kieuDang : " + kieuDang + '\'' +
                ", soLuong : " + soLuong +
                "Type : " + ProductCategory.DIENMAY+
                '}';
        return display;
    }

    @Override
    public ProductCategory getProductCategory() {
        return ProductCategory.DIENMAY;
    }


}
