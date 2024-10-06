package com.jav.lhloc.lab1assignement;

public class TiepThi extends NhanVien {
    private double doanhSo; //1 tỷ
    private double hoaHong; //1%

    public TiepThi(double doanhSo,
                   double hoaHong,
                   String mnv,
                   String hoten,
                   double luong) {
        super(mnv, hoten, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    @Override
    public double getThuNhap() {
        return super.getLuong() + (this.doanhSo * this.hoaHong/100);
    }
}
