package com.jav.hoang.Aggsiment;

public class NhanVien {
    String Manv;
    String hoTen;
    Double luong;


    public NhanVien (){

    }
    public NhanVien (String Manv,String hoTen ,Double luong){
        this.Manv = Manv;
        this.hoTen = hoTen;
        this.luong = luong;

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String manv) {
        Manv = manv;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }



    public Double getThuNhap() {
        double luongThang = this.getLuong();
        return luongThang;
    }
    public  void getThueTn(){
            if (getThuNhap() < 9000.000 ){
                System.out.println("Thu nhập không cần đống thuế ");
            }else if
            (getThuNhap() >=  9000.000 && getThuNhap() <=15000.000 ) {
                Double soTienPhaiDong = getThuNhap() / 0.1;

                System.out.println("Bạn cần đóng 10% thuế ");
                System.out.println(soTienPhaiDong);
            } else {
                Double soTienPhaiDongThueFull = getThuNhap() / 0.15;
                System.out.println("Bạn cần phải đóng 15% thuế ");
            }

            }

    public static void xuatThongTin(){

    }
}
