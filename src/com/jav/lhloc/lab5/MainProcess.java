package com.jav.lhloc.lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProcess {

    private static ArrayList<SinhVien> listSinhVienStatic = new ArrayList<>();

    public static void main(String[] args) {

        MainProcess mainProcess = new MainProcess();

        ArrayList<SinhVien> listSinhVien = mainProcess.nhapDanhSachSinhVien();
//        System.out.println("=================");
//        mainProcess.xuatDanhSachSinhVien(listSinhVien);

//        NhanVien sinhVienDauTien = listSinhVien.get(0);
//        mainProcess.xuatSinhVienDauTien(sinhVienDauTien);
//        System.out.println("=================");
//        mainProcess.xuatDanhSachSinhVienTheoDiem(listSinhVien);
//
//        mainProcess.xuatDanhSachSinhVienTheoDiem(listSinhVien, 7.0f, 9.0f);
//        System.out.println("=================");
//        mainProcess.timSinhVienTheoTen(listSinhVien, "Van A");
//        System.out.println("=================");
        mainProcess.suaSinhVienTheoTen(listSinhVien, "Van B");

        mainProcess.xuatDanhSachSinhVien(listSinhVien);
//        System.out.println("=================");

//        mainProcess.xoaSinhVienTheoTen(listSinhVien);

//        mainProcess.xuatDanhSachSinhVien(listSinhVien);

//input();
    }

    private void xuatSinhVienDauTien(SinhVien sinhVienDauTien) {

    }

    private void xoaSinhVienTheoTen(ArrayList<SinhVien> listSinhVien) {
        String searchText = "Van B";//Nhap tu ban phim
        for(int i = 0; i < listSinhVien.size(); i++) {
            SinhVien sv = listSinhVien.get(i);
            if (sv.getFullName().contains(searchText)) {
                listSinhVien.remove(i);
            }
        }
    }

    private void suaSinhVienTheoTen(ArrayList<SinhVien> listSinhVien, String ten) {

        ArrayList<SinhVien> sinhVienTimDuocTheoTen = timSinhVienTheoTen(listSinhVien, ten);

        for(int i = 0; i < sinhVienTimDuocTheoTen.size(); i++) {
            SinhVien sv = sinhVienTimDuocTheoTen.get(i);
//            extracted(sv);
            sv.setPoint(10.0f);
        }
    }

    private static void extracted(SinhVien sv) {
        sv.setPoint(10.0f);
    }

    private ArrayList<SinhVien> timSinhVienTheoTen(ArrayList<SinhVien> listSinhVien, String searchText) {

        ArrayList<SinhVien> listSinhVienTimDuoc = new ArrayList<>();

        for(int i = 0; i < listSinhVien.size(); i++) {
            SinhVien sv = listSinhVien.get(i);
            if (sv.getFullName().contains(searchText)) {
                listSinhVienTimDuoc.add(sv);
            }
        }

        return listSinhVienTimDuoc;
    }

    private void xuatDanhSachSinhVienTheoDiem(ArrayList<SinhVien> listSinhVien) {
        float fromPoint = 7.0f; //Lôc vi du, thuc te nen nhap tu ban phim
        float toPoint = 9.0f;
        xuatDanhSachSinhVienTheoDiem(listSinhVien, fromPoint, toPoint);
    }


    private void xuatDanhSachSinhVienTheoDiem(ArrayList<SinhVien> listSinhVien,
                                              float fromPoint,
                                              float toPoint) {
        for(int i = 0; i < listSinhVien.size(); i++) {
            SinhVien sinhVien = listSinhVien.get(i);
            if (sinhVien.getPoint() >= fromPoint && sinhVien.getPoint() <= toPoint) {
                System.out.println(i + ": " + sinhVien.getFullName() + " - " + sinhVien.getPoint());
            }
        }
    }

    private void xuatDanhSachSinhVien(ArrayList<SinhVien> listSinhVien) {
        System.out.println("Danh sach sinh vien:");
//        for (NhanVien sv : listSinhVien) {
//            System.out.println(sv.getFullName() + " - " + sv.getPoint());
//        }

        for(int i = 0; i < listSinhVien.size(); i++) {
            SinhVien sv = listSinhVien.get(i);
            System.out.println(i + ": " + sv.getFullName() + " - " + sv.getPoint());
        }
    }

    private ArrayList<SinhVien> nhapDanhSachSinhVien() {
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();

        listSinhVien.add(new SinhVien("Nguyen Van A", 8.5f));//1
        listSinhVien.add(new SinhVien("Nguyen Van B", 7.5f));//2
        listSinhVien.add(new SinhVien("Nguyen Van C", 9.5f));//3
        listSinhVien.add(new SinhVien("Nguyen Van D", 6.5f));
        listSinhVien.add(new SinhVien("Nguyen Van E", 5.5f));

        return listSinhVien;
    }

    private static void input(){
        for(int i = 1; i <=5;i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap ten sinh vien thu " + i + ": ");
            String fullName = scanner.nextLine();
            System.out.println("Nhap diem sinh vien thu " + i + ": ");
            float point = scanner.nextFloat();
        }
    }
}
