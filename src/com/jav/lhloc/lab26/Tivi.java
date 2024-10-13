package com.jav.lhloc.lab26;

public class Tivi {
    private String thuongHieu;
    private int gia;

    @Override
    public String toString() {
        return "Tivi{" +
                "thuongHieu='" + thuongHieu + '\'' +
                ", gia=" + gia +
                '}';
    }

    public Tivi(String thuongHieu, int gia) {
        this.thuongHieu = thuongHieu;
        this.gia = gia;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public int getGia() {
        return gia;
    }
}
