package com.jav.lhloc.lab71;

import java.io.Serializable;

public abstract class SinhVienPoly implements Serializable {

    private String hoTen;
    private String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        double diem = getDiem();

        if (diem < 5) {
            return "Yếu";
        }

        if (diem < 6.5) {
            return "Trung bình";
        }

        if (diem < 7.5) {
            return "Khá";
        }

        if (diem < 9) {
            return "Giỏi";
        }

        return "Xuất sắc";
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }
}

