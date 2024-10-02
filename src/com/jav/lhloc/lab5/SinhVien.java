package com.jav.lhloc.lab5;

import java.util.regex.Matcher;

public class SinhVien {

    private String fullName;
    private float point;

    public SinhVien() {
    }

    public SinhVien(String fullName, float point) {
        this.point = point;
        this.fullName = fullName;
    }

    String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public static void main(String[] args) {

        String text = "40"; //chuoi so =>
        String regex = "\\d{2,7}"; // \d = [0-9]

        //Kiem tra 1 chuoi co phai la so hay ko?
        System.out.println(text.matches(regex));
    }

}
