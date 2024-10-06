package com.jav.lhloc.lab1assignement;

import java.util.ArrayList;

public class Process {
    public static void main(String[] args) {
        ArrayList<NhanVien> nhanViens = new ArrayList<>();
        nhanViens.add(new TiepThi(1000000000, 1, "NV2", "Nguyen Van B", 10000000));
        nhanViens.add(new TruongPhong(1000000000, "NV3", "Nguyen Van C", 10000000));

        for (NhanVien nhanVien : nhanViens) {
            System.out.println(nhanVien.xuatThongTin());
        }
    }
}
