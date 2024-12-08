package com.jav.lhloc.lab24;

public class SinhVien {
    private String name;
    private String id;

    public SinhVien(String nguyenVanA, String number) {
        this.name = nguyenVanA;
        this.id = number;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
