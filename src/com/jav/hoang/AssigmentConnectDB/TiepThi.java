package com.jav.hoang.AssigmentConnectDB;

public class TiepThi extends NhanVien {
    private Double doanhSo;
    private Double hueHong;


    public TiepThi(int MaNv, String Name, Double Salary,Double doanhSo,Double hueHong) {
        super(MaNv, Name, Salary);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }
    @Override
    public Double getThuNhap() {
        return super.getThuNhap();
    }
}
