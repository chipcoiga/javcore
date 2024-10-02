package com.jav.lhloc.lab7;

public class TruongPhong extends NhanVien {
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void printInfo() {

    }

    public String getName() {
        return "TP: " + super.getName();
    }
}
