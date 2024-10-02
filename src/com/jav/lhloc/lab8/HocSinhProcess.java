package com.jav.lhloc.lab8;

public class HocSinhProcess {

    public static void main(String[] args) {
//        final int aAaaaaaa = 5;
//
////        aAaaaaaa = aAaaaaaa + 1;
//        System.out.println(aAaaaaaa);
//
//        HocSinh hs1 = new HocSinh();
//        hs1.setName("Nguyen Van A");
//
//        HocSinh.age = 10;
//        HocSinh.setAge(14);
//        HocSinh.QuyLop quyLop = new HocSinh.QuyLop();
//
////        HocSinh.QuyLop quyLop = new HocSinh.QuyLop();
//
//        quyLop.setQuyLop(15);
//
//        HocSinh hs2 = new HocSinh();
//        hs2.setName("Nguyen Van B");

        HocSinhProcess hocSinhProcess = new HocSinhProcess();
        hocSinhProcess.extracted(15);
    }

    public void extracted(int num) {
        if (num <= 10) {
            System.out.println("So nho hon hoac bang 10");
            return;
        }

        num = num - 2;
        System.out.println(num);

        extracted(num);
    }

}
