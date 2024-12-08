package com.jav.hoang.BaiTapHashMap;

import com.jav.lhloc.lab8.HocSinh;

import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Double> Hoang = new HashMap<>();
        HashMap<String, Double> Kha = new HashMap<>();
        HashMap<String, Double> Loc = new HashMap<>();

        Hoang.put("Toan", 10.0);
        Hoang.put("Ly", 9.0);
        Hoang.put("Hoa", 15.7);

        Kha.put("Toan", 1.0);
        Kha.put("Ly", 33.0);
        Kha.put("Hoa", 4.7);


        Loc.put("Toan", 66.0);
        Loc.put("Ly", 55.0);
        Loc.put("Hoa", 152.7);

        themDiem(Hoang);
//        for (String diem : Hoang.keySet()){
//            System.out.println(diem + "-" +Hoang.get(diem));
        System.out.println(Hoang);
       // tinh diem trung binh
        Double diemTB = tinhDiemTrungBinh(Hoang);
        System.out.println(diemTB);

        // hien thi bang diem
        hienThiBangDiem(Hoang);
    }

    public static void themDiem(HashMap<String , Double> ten) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap key cho hashMap");
        String a = scanner.nextLine();
        System.out.println("Nhap value cho hashMap");

        Double b = scanner.nextDouble();

        ten.put(a, b);

    }

    public static Double tinhDiemTrungBinh(HashMap<String, Double> tinhDiem) {
        Double tongDiem = 0.0;
        int soLuong = tinhDiem.values().size();
        tinhDiem.keySet().size();
        tinhDiem.size();

        for (Double a : tinhDiem.values()) {
            tongDiem += a;

        }
        return tongDiem / soLuong ;
    }
    public static void hienThiBangDiem (HashMap<String, Double> bangDiem){
        System.out.println("Bang Diem co gia tri la");
        System.out.println(bangDiem.values());
    }
}


