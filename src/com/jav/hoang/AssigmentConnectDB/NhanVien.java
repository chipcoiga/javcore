package com.jav.hoang.AssigmentConnectDB;

public class NhanVien {
    private int MaNv;
    private String Name;
    private Double Salary;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public int getMaNv() {
        return MaNv;
    }

    public void setMaNv(int maNv) {
        MaNv = maNv;
    }

    public NhanVien (int MaNv,String Name,Double Salary){
        this.MaNv = MaNv;
        this.Name = Name;
        this.Salary = Salary;

    }
    public Double getThuNhap (){
        Double luongThang = this.getSalary();
        return luongThang;
    }
}
