package com.jav.hoang.Aggsiment;

import java.util.Collections;
import java.util.Comparator;

public class MainProcess {
    public static void main(String[] args) {
        NhanVien[] NhanVienArray = NhapDSNV();
        XuatDanhSachNhanVien(NhanVienArray);
        TimVaHienThiNhanVien(NhanVienArray,"Hoang");
        CapNhatThongTinNhanVien(NhanVienArray,"Kha");
        TimNhanVienTheoLuong(NhanVienArray,10.0,30.2);
        SapXepLuongNhanVien(NhanVienArray);
        XuatRa5NhanVienCoThuNhapCaoNhat(NhanVienArray);
    }

    private static void XuatRa5NhanVienCoThuNhapCaoNhat(NhanVien[] thuNhapCao) {
        System.out.println("5 Nhân viên có thu nhập cao nhất là : ");
        NhanVien temp  =  thuNhapCao[0];
        for (int i = 0; i < thuNhapCao.length - 1; i++) {
            for (int j = i+1; j < thuNhapCao.length; j++) {
                if (thuNhapCao[i].getLuong() < thuNhapCao[j].getLuong()) {
                    temp = thuNhapCao[j];
                    thuNhapCao[j] = thuNhapCao[i];
                    thuNhapCao[i] = temp;

                }
            }
        }
        for (int i = 0; i < 5; i++){
            NhanVien nv = thuNhapCao[i];
            System.out.println("Ho ten :" + nv.getHoTen()+"Luong :" + nv.getLuong());
        }
    }

    private static void SapXepLuongNhanVien(NhanVien[] sapXepLuong) {
        System.out.println("Sau khi lương được sắp xếp");
        NhanVien temp  =  sapXepLuong[0];
        for (int i = 0; i < sapXepLuong.length - 1; i++) {
            for (int j = i+1; j < sapXepLuong.length; j++) {
                if (sapXepLuong[i].getLuong() > sapXepLuong[j].getLuong()) {
                    temp = sapXepLuong[j];
                    sapXepLuong[j] = sapXepLuong[i];
                    sapXepLuong[i] = temp;
                }
                }
            }
        for (NhanVien nv : sapXepLuong){
            System.out.println(nv.getLuong());
        }
    }
        private static void TimNhanVienTheoLuong(NhanVien[] luongSapXep,Double fromSalary,Double toSalary) {
        System.out.println("Nhân viên có khoảng lương như sau :  ");
        for (int i = 0; i < luongSapXep.length; i++) {
            NhanVien nv = luongSapXep[i];
            if (nv.getLuong() >= fromSalary && nv.getLuong() <= toSalary) {
                System.out.println("Mã nhân viên là : " + nv.getManv() + "Tên :" + nv.getHoTen() + "Lương :" + nv.getLuong());
            }

        }
    }
    private static void CapNhatThongTinNhanVien(NhanVien[] NhanVienTimVaHienThi,String NameUpdate) {

        for (int i = 0; i < NhanVienTimVaHienThi.length; i++) {
            NhanVien nv = NhanVienTimVaHienThi[i];
            if (nv.getHoTen().contains(NameUpdate)) {
                NhanVienTimVaHienThi[i].setManv("022");
                NhanVienTimVaHienThi[i].setHoTen("Người Đổi Thay");
                NhanVienTimVaHienThi[i].setLuong(99.9999);
            }
        }
        System.out.println("Nhân vien sau khi update là : ");
        XuatDanhSachNhanVien(NhanVienTimVaHienThi);
    }

    private static void TimVaHienThiNhanVien(NhanVien[] NhanVienTimVaHienThi, String nameSearch) {
        for (int i = 0; i < NhanVienTimVaHienThi.length; i++) {
            NhanVien nv = NhanVienTimVaHienThi[i];
            if (nv.getHoTen().contains(nameSearch)) {
                System.out.println("Nhân viên bạn cần search là : ");
                System.out.println("Mã nhân viên là : " + nv.getManv() + "Tên :" +nv.getHoTen() + "Lương :" + nv.getLuong());
            }
        }
    }

    private static void XuatDanhSachNhanVien(NhanVien [] NhanVienArr) {
        for (int i =0; i<NhanVienArr.length;i++){
            //nv = null khong co gi // nv = nhan vien dau tien

            NhanVien nv = NhanVienArr[i];
            //NhanVien nv  = nhanvienarr[0]-> nhanvien vi tri 0

            System.out.println("Mã nhân viên là : " + nv.getManv() + "Tên :" +nv.getHoTen() + "Lương :" + nv.getLuong());
        }
    }

    private static NhanVien[] NhapDSNV() {
        NhanVien [] nhanvienss = new NhanVien[8];
        TiepThi [] tiepthis = new TiepThi[2];
        TruongPhong [] truongPhongs = new TruongPhong[1];

        System.out.println("Thông tin của sinh viên : ");
        nhanvienss[0] = new NhanVien("01","Hoang Nguyen",10.10);
        nhanvienss[1] = new NhanVien("02","Kha Pham",20.20);
        nhanvienss[2] = new NhanVien("03","Loc Le",30.30);
        nhanvienss[3] = new NhanVien("04","Loan Tran",80.40);
        nhanvienss[4] = new NhanVien("05","Sieu Nhan",50.50);
        nhanvienss[5] = new NhanVien("06","Japan",60.60);
        nhanvienss[6] = new NhanVien("06","Japan",90.60);
        nhanvienss[7] = new NhanVien("06","Japan",70.60);

//nhan vien : manv , ho ten , luong -> nv tiep thi + hue hong + doanh -> truong phong + trach nhiem
        tiepthis [0] = new TiepThi(70.0,39.0);
        tiepthis [1] = new TiepThi(80.0,40.0);
        truongPhongs[0] = new TruongPhong(292.1);

        return nhanvienss;
    }

}
