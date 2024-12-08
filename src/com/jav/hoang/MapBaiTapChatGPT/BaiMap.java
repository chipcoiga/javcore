package com.jav.hoang.MapBaiTapChatGPT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaiMap {
    public static void main(String[] args) {
        Integer id;
        String ten;
      Map<Integer, String> ThongTinSinhVien = new HashMap<>();

      ThongTinSinhVien.put(01,"Hoang Nguyen");
      ThongTinSinhVien.put(02,"Kha Pham");
      ThongTinSinhVien.put(03,"Loc Le");
      ThongTinSinhVien.put(05,"Chua te bau troi");
      ThongTinSinhVien.put(04,"Ronaldo");
      UseIDGetName(ThongTinSinhVien);
    }
    public static void UseIDGetName (Map<Integer, String> userID ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID vao day ");
        Integer id = scanner.nextInt();

        if (userID.containsKey(id)){
            userID.get(id);
            System.out.println("Ten ban tim kiem voi ID la " + id + ":" + userID.get(id));
        }
        else {
            System.out.println("Khong co ID ton tai ");
        }
    }
}
