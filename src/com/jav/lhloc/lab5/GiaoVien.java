package com.jav.lhloc.lab5;

public class GiaoVien extends SinhVien {

    public GiaoVien(String fullName, float point) {
        super(fullName, point);
    }

    public static void main(String[] args) {
        GiaoVien gv = new GiaoVien("Nguyen Van A", 8.5f);
        System.out.println("Name: " + gv.getFullName());
        System.out.println("Point: " + gv.getPoint());
    }
}
