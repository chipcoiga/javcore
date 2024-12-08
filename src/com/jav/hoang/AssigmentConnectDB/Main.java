package com.jav.hoang.AssigmentConnectDB;

import java.sql.*;
import java.util.ArrayList;

import static java.sql.DriverManager.getConnection;

public class Main {

    private static String DB_URL = "jdbc:mysql://localhost:3306/hoangdb";
    private static String USER_NAME = "root";
    private static String PASSWORD = "123456";

    public static void main(String[] args) {
        ArrayList<NhanVien> nv = nhapDsnv();
        showDanhsachNhanVien(nv);
        TimVaHienThiNhanVien(nv,"MAN");
    }

    private static void TimVaHienThiNhanVien(ArrayList <NhanVien> nv, String keySearch) {
        for (int i = 0; i<nv.size();i++){
            NhanVien nhanvien = nv.get(i);
            if (nhanvien.getName().contains(keySearch)){
                System.out.println("Ten nhan vien duoc tim thay la : ");
                System.out.println("Ma nhan vien : " + nhanvien.getMaNv() + " Ten : " + nhanvien.getName() + " Salary : " +nhanvien.getMaNv());
            }else {
        }
        }
    }

    private static ArrayList<NhanVien> nhapDsnv() {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            //create statement
            Statement stmt = conn.createStatement();
            //get data from table student
            ResultSet rs = stmt.executeQuery("select * from nhanvien ");
            //show data
            ArrayList<NhanVien> nv = new ArrayList<>();

            while (rs.next()) {
                nv.add(new NhanVien(rs.getInt(1), rs.getString(2),
                        rs.getDouble(3)));

            }
            //close connection
            conn.close();
            return nv;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showDanhsachNhanVien(ArrayList <NhanVien> nv){
        for (int i = 0; i<nv.size();i++){
            NhanVien nhanvien = nv.get(i);
            System.out.println("Ma nhan vien : " + nhanvien.getMaNv() + " Ten : " + nhanvien.getName() + " Salary : " +nhanvien.getMaNv());
        }

    }
    }

