package com.jav.lhloc.lab71;

public class MainProcess {
    public static void main(String[] args) {
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien(5);
        /**
         * SinhVienPoly[] sinhViens = new SinhVienPoly[5];
         * sinhViens[0] = null
         * sinhViens[1] = null
         * sinhViens[2] = null
         * sinhViens[3] = null
         * sinhViens[4] = null
         *
         * quanLySinhVien.addSinhVien(sinhVienIT1);
         * sinhViens[0] = sinhVienIT1
         * sinhViens[1] = null
         * sinhViens[2] = null
         * sinhViens[3] = null
         * sinhViens[4] = null
         *  quanLySinhVien.addSinhVien(sinhVienIT2);
         * sinhViens[0] = sinhVienIT1
         * sinhViens[1] = sinhVienIT2
         * sinhViens[2] = null
         * sinhViens[3] = null
         * sinhViens[4] = null
         * ...
         */

        SinhVienIT sinhVienIT1 = new SinhVienIT(
                "Nguyen Van A (it)",
                8,
                7,
                9);
        SinhVienIT sinhVienIT2 = new SinhVienIT(
                "Nguyen Van B (it)",
                1,
                3,
                2);
        SinhVienIT sinhVienIT3 = new SinhVienIT(
                "Nguyen Van C (it)",
                5,
                6,
                7);

        SinhVienBiz sinhVienBiz1 = new SinhVienBiz(
                "Nguyen Van C (biz)",
                8,
                9);
        SinhVienBiz sinhVienBiz2 = new SinhVienBiz(
                "Nguyen Van D (biz)",
                3,
                5);

        quanLySinhVien.addSinhVien(sinhVienIT1);
        quanLySinhVien.addSinhVien(sinhVienIT2);
        quanLySinhVien.addSinhVien(sinhVienIT3);
        quanLySinhVien.addSinhVien(sinhVienBiz1);
        quanLySinhVien.addSinhVien(sinhVienBiz2);

        quanLySinhVien.showSinhVien();

        quanLySinhVien.showSinhVienHocLucGioi();

        System.out.println("Show sinh vien theo diem tang dan:");
        quanLySinhVien.sapXepSinhVienTheoDiem();
        quanLySinhVien.showSinhVien();
    }
}
