package com.jav.lhloc.lab1assignement;

public class TruongPhong extends NhanVien {
    private double luongTrachNhiem; //1 tỷ

    public TruongPhong(double luongTrachNhiem,
                       String mnv,
                       String hoten,
                       double luong) {
        super(mnv, hoten, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public double getThuNhap() {
        return super.getLuong() + luongTrachNhiem;
    }
}
