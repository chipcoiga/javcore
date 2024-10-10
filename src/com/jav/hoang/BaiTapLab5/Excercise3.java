package com.jav.hoang.BaiTapLab5;

import com.jav.hoang.LuyenTap.Main;

public class Excercise3 {
    public static void main(String[] args) {
        try {
            cardNumber("99121");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Deprecated
    public static boolean cardNumber(String card) throws Exception {
        boolean c = true;
        int n = 0;
        String[] kiTuArray = card.split("");
        for (String a : kiTuArray) {
            double f = Double.parseDouble(a);
            n += f;
        }
        System.out.println(n);
        if (n % 2 != 0){
            throw new Exception("Tổng của số này là số lẽ");
            }else {
          }
        System.out.println("Số này chia là số chẵn");
        return false;


}

}

