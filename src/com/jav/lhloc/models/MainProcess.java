package com.jav.lhloc.models;

import java.time.LocalDate;
import java.util.Scanner;

public class MainProcess {
    public static void main(String[] args) {

        HocSinh hs = new HocSinh();

        nhapDiem(hs);

        xuatHocLuc(hs);

    }

    private static void xuatHocLuc(HocSinh hs) {
        int diem = hs.getDiem();

        if (diem >= 8) {
            System.out.println("HSG");
            return;
        }

        if (diem >= 5) {
            System.out.println("HSK");
            return;
        }

        System.out.println("HSTB");
    }

    private static void nhapDiem(HocSinh hs) {
        hs.setName("hoang");
        hs.setDiem(7); // scanner
    }
}
