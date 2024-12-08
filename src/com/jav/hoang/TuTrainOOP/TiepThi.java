package com.jav.hoang.TuTrainOOP;

public class TiepThi extends NhanVien {
    private Double doanhSo;
    private Double hueHong;


    public Double getHueHong() {
        return hueHong;
    }

    public void setHueHong(Double hueHong) {
        this.hueHong = hueHong;
    }

    public Double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(Double doanhSo) {
        this.doanhSo = doanhSo;
    }


    public TiepThi(String manv, String hoTen, Double luong, Double doanhSo , Double hueHong) {
        super(manv, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;

    }

    @Override
    public double getThuNhap() {
        Double thuNhapTiepThi = super.getLuong()+getDoanhSo()+getHueHong();
        return thuNhapTiepThi;
    }
}
