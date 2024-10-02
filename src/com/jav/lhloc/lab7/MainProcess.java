package com.jav.lhloc.lab7;

public class MainProcess {
    public static void main(String[] args) {
        MainProcess mainProcess = new MainProcess();

        TruongPhong truongPhong = new TruongPhong();
        truongPhong.setName("Nguyen Van A");
        mainProcess.quanLyTruongPhong(truongPhong);

        NhanVien nhanVien = new NhanVien();
        nhanVien.setName("Nguyen Van B");
        mainProcess.quanLyNhanVien(nhanVien);
    }

    public void quanLyNhanVien(NhanVien nv) {

        System.out.println("Name: " + nv.getName());
        System.out.println("Name: " + nv.getGender());
        System.out.println("Name: " + nv.getAge());
    }

    public void quanLyTruongPhong(TruongPhong truongPhong) {
        System.out.println("Name: " + truongPhong.getName());
    }
}
