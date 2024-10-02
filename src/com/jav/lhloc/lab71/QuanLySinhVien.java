package com.jav.lhloc.lab71;

import java.util.Arrays;

public class QuanLySinhVien {
    private SinhVienPoly[] sinhViens;
    private int size;

    public QuanLySinhVien(int size) {
        this.size = size;
        sinhViens = new SinhVienPoly[size];
    }

    public void addSinhVien(SinhVienPoly sinhVien) {
        for (int i = 0; i < sinhViens.length; i++) {
            if (sinhViens[i] == null) {
                sinhViens[i] = sinhVien;
                break;
            }
        }
    }

    public void showSinhVien() {
        System.out.println("Danh sách sinh viên:");
        for (int i = 0; i < sinhViens.length; i++) {
            System.out.println(sinhViens[i].getHoTen());
            System.out.println(sinhViens[i].getNganh());
            System.out.println(sinhViens[i].getDiem());
            System.out.println(sinhViens[i].getHocLuc());
            System.out.println("======================");
        }
        //chia thanh 2 thread, moi thread chay 1/2 sinh vien
        //100
        //thread 1: 50 sinh vien dau tien
        //thread 2: 50 sinh vien cuoi

    }

    public void showSinhVienHocLucGioi() {
        System.out.println("Danh sách sinh viên học lực giỏi:");
        for (int i = 0; i < size; i++) {
            if ("Giỏi".equals(sinhViens[i].getHocLuc())) {
                System.out.println(sinhViens[i].getHoTen());
                System.out.println(sinhViens[i].getNganh());
                System.out.println(sinhViens[i].getDiem());
                System.out.println(sinhViens[i].getHocLuc());
                System.out.println("======================");
            }
        }
    }

    /**
     * 3, 7, 2, 6, 9
     * i = 0 => 3
     * j = 1 => 7
     * j = 2 => 2
     * array[i] = 3
     * array[j] = 2
     * int temp = array[i] => temp = 3
     * array[i] = array[j] => array[i] = 2
     * array[j] = temp => array[j] = 3
     * 2, 7, 3, 6, 9
     * i = 0 => 2
     * j = 3 => 6
     * array[i] = 2
     * array[j] = 6
     * j = 4 => 9
     * array[i] = 2
     * array[j] = 9
     * i = 1 => 7
     * j = i + 1 => 2
     * array[i] = 7
     * array[j] = 3
     * int temp = array[i] => temp = 7
     * array[i] = array[j] => array[i] = 3
     * array[j] = temp => array[j] = 7
     * 2, 3, 7, 6, 9
     * j = j + 1 => 3
     * array[i] = 3
     * array[j] = 6
     * ...
     * i = 2
     * j = i + 1 = 3
     * array[i] = 7
     * array[j] = 6
     * int temp = array[i] => temp = 7
     * array[i] = array[j] => array[i] = 6
     * array[j] = temp => array[j] = 7
     * 2, 3, 6, 7, 9
     *
     * 2, 3, 6, 7, 9
     *
     * i = 0 => length:5 - 2
     * j = 1 => length:5 - 1
     */
    public void sapXepSinhVienTheoDiem() {
        for (int i = 0; i <= sinhViens.length - 2; i++) {
            for (int j = i + 1; j <= sinhViens.length - 1; j++) {
                swap(i, j);
            }
        }
    }

    private void swap(int i, int j) {
        Double diemI = sinhViens[i].getDiem();
        Double diemJ = sinhViens[j].getDiem();
        if (diemJ < diemI) {
            SinhVienPoly temp = sinhViens[i];
            sinhViens[i] = sinhViens[j];
            sinhViens[j] = temp;
        }
    }

    public void testSwapMethod() {
        SinhVienPoly[] sinhViens = new SinhVienPoly[5];
        sinhViens[0] = new SinhVienIT("A", 3, 4, 5);
        sinhViens[1] = new SinhVienIT("B", 7, 8, 9);
        sinhViens[2] = new SinhVienIT("C", 2, 3, 4);
        sinhViens[3] = new SinhVienIT("D", 6, 7, 8);
        sinhViens[4] = new SinhVienIT("E", 9, 10, 10);
        //ABCDE

        //Goi ham swap

        //Swap A and C
        System.out.println("Sau khi swap:");
        //CBADE

        System.out.println(Arrays.toString(sinhViens));
    }
}
