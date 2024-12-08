package com.jav.hoang.TuTrainOOP;

public class TruongPhong extends NhanVien {
    private Double trachNhiem;

    public TruongPhong(String manv, String hoTen, Double luong, Double trachNhiem) {
        super(manv, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        Double thuNhap = super.getLuong() + getTrachNhiem();
        return thuNhap;
    }

    public Double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(Double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
}
