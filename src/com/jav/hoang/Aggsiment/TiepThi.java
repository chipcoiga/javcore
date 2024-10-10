package com.jav.hoang.Aggsiment;

public class TiepThi extends NhanVien {

    NhanVien nv = new NhanVien();
    Double doanhSo;
    Double hueHong;

    public TiepThi (Double doanhSo,Double hueHong){
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public Double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(Double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public Double getHueHong() {
        return hueHong;
    }

    public void setHueHong(Double hueHong) {
        this.hueHong = hueHong;
    }

    @Override
    public Double getThuNhap() {
       Double luongThang = nv.getLuong();
       Double hueHong = this.getHueHong();
       Double doanhSo = this.getDoanhSo();
       Double tongThuNhapCuaTiepThi = luongThang + hueHong +doanhSo;
       return tongThuNhapCuaTiepThi;
    }
}
