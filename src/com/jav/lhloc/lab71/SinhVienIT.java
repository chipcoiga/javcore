package com.jav.lhloc.lab71;

public class SinhVienIT extends SinhVienPoly {
    private double diemJava;
    private double diemCss;
    private double diemHtml;

    @Override
    public double getDiem() {
        return (2 * diemJava + diemCss + diemHtml) / 4;
    }

    public SinhVienIT(String hoTen,
                      double diemJava,
                      double diemCss,
                      double diemHtml) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
}
