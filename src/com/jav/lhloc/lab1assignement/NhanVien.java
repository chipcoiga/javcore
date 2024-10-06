package com.jav.lhloc.lab1assignement;

public abstract class NhanVien {
    private String mnv;
    private String hoten;
    private double luong;

    public NhanVien(String mnv, String hoten, double luong) {
        this.mnv = mnv;
        this.hoten = hoten;
        this.luong = luong;
    }

    public abstract double getThuNhap();

    public double getThueThuNhap() {
        double thueThuNhap = 0;
        if (getThuNhap() < 9000000) {
            thueThuNhap = 0;
        } else if (getThuNhap() >= 9000000 && getThuNhap() < 15000000) {
            thueThuNhap = getThuNhap() * 0.1;
        } else if (getThuNhap() >= 15000000 && getThuNhap() < 20000000) {
            thueThuNhap = getThuNhap() * 0.15;
        } else if (getThuNhap() >= 20000000 && getThuNhap() < 30000000) {
            thueThuNhap = getThuNhap() * 0.2;
        } else if (getThuNhap() >= 30000000) {
            thueThuNhap = getThuNhap() * 0.25;
        }
        return thueThuNhap;
    }

    public String xuatThongTin() {
        return "Ma nhan vien: " + mnv + "\n" +
                "Ho ten: " + hoten + "\n" +
                "Luong: " + luong + "\n" +
                "Thu nhap: " + getThuNhap() + "\n" +
                "Thue thu nhap: " + getThueThuNhap() + "\n";
    }

    public String getMnv() {
        return mnv;
    }

    public void setMnv(String mnv) {
        this.mnv = mnv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
