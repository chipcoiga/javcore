package com.jav.hoang.TuTrainOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Formattable;

public class Main {
    public static void main(String[] args) {
        ArrayList<NhanVien> nv = NhapDSNhanVien();
        XuatDsNhanVien(nv);
        XoaNhanVienTheoMaNhapTuBanPhim(nv, "02");
        CapNhatNhanVienTheoMaNhapTuBanPhim(nv,"03");
        TimNhanVienTheoSalary(nv,7.000,18.000);
        SapXepNhanVienTheoHoVaTen(nv);
        SapXepNhanVienTheoThuNhap(nv);
        SapXepNhanVienTheo5NguoiLuongCao(nv);
        



    }

    private static void SapXepNhanVienTheo5NguoiLuongCao(ArrayList<NhanVien> luongCao) {
        Comparator <NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o2.getLuong().compareTo(o1.getLuong());
            }
        };
        Collections.sort(luongCao,comp);
        System.out.println(" 5 nguoi luong cao nhat la");

        for (int i = 0 ; i< 4; i++){
            NhanVien nv = luongCao.get(i);
            System.out.println("ten " + nv.getHoTen() + "luong" + nv.getLuong());
        }

            }




    private static void SapXepNhanVienTheoThuNhap(ArrayList<NhanVien> thuNhapSapXep) {

        Comparator <NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getLuong().compareTo(o2.getLuong());
            }
        };
        Collections.sort(thuNhapSapXep,comp);
        System.out.println("Thu Nhap sau khi sap xep ");

        for (NhanVien x : thuNhapSapXep){
            System.out.println(x.getLuong());
        }

    }

    private static void SapXepNhanVienTheoHoVaTen(ArrayList<NhanVien> sxht) {
        Comparator <NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        };
        Collections.sort(sxht,comp);
        System.out.println("ho ten sau khi sap xep");

        for (NhanVien x : sxht){
            System.out.println(x.getHoTen());
        }

    }

    private static void TimNhanVienTheoSalary(ArrayList<NhanVien> searchTheoLuong, double fromLuong,double toLuong) {
        for (int i = 0; i < searchTheoLuong.size(); i++) {
            NhanVien nv = searchTheoLuong.get(i);
            if (nv.getLuong() >fromLuong && nv.getLuong()<toLuong ){
                System.out.println("Ten :" + nv.getHoTen() + " Luong :" + nv.getLuong());
            }
        }
    }

    private static void CapNhatNhanVienTheoMaNhapTuBanPhim(ArrayList<NhanVien> updateNhanVien,String maNvCanUpdate) {
        for (int i = 0; i < updateNhanVien.size(); i++) {
            NhanVien nv = updateNhanVien.get(i);
            if (nv.getMaNV().contains(maNvCanUpdate)) {
                updateNhanVien.set(i,new NhanVien("099","le thi dai ca",9990.2));
                System.out.println("Danh sach sau khi update la :");
                XuatDsNhanVien(updateNhanVien);
            }
        }
    }
    private static void XoaNhanVienTheoMaNhapTuBanPhim(ArrayList<NhanVien> xoaNhanVien, String deleteName) {
        for (int i = 0; i < xoaNhanVien.size(); i++) {
            NhanVien nv = xoaNhanVien.get(i);
            if (nv.getMaNV().contains(deleteName)) {
                xoaNhanVien.remove(i);
                System.out.println("Ten nhan vien bi xoa la : " + nv.getHoTen());
            }
        }
    }


    private static void XuatDsNhanVien(ArrayList <NhanVien> xuatDs) {
        for (int i = 0; i<xuatDs.size();i++){
            NhanVien nv = xuatDs.get(i);
            System.out.println(" MaNV " + nv.getMaNV() + " Ten " + nv.getHoTen() + " Luong " + nv.getLuong());
        }
    }

    private static ArrayList<NhanVien> NhapDSNhanVien() {

        ArrayList<NhanVien> nhap = new ArrayList<>();
        nhap.add(new TruongPhong("02","kha pham", 10.000,2.32));
        nhap.add(new TiepThi("03","hoang nguyen", 9.000,2.3,4.9));
        nhap.add(new NhanVien("04","loan le", 14.000));
        nhap.add(new TruongPhong("05","kha pham", 12.000,2.32));
        nhap.add(new TiepThi("01","hoang nguyen", 16.000,2.3,4.9));
        nhap.add(new NhanVien("07","loan le", 20.000));
        return nhap;
    }
}
