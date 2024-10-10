package com.jav.hoang.Aggsiment;

public class TruongPhong extends NhanVien{
    Double trachNhiem;
    NhanVien nv = new NhanVien();

    public TruongPhong(Double trachNhiem){
        this.trachNhiem = trachNhiem;
    }


    public Double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(Double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }


    @Override
    public Double getThuNhap() {
       Double luongTruongPhong = nv.getLuong();
       Double luongTrachNhiem = this.getTrachNhiem();
       Double thuNhapCuaTruongPhong = luongTruongPhong+luongTrachNhiem;
       return thuNhapCuaTruongPhong;

    }

}

