package com.jav.hoang.BaiTapLab5;

public class Ecercise1 {
    public static void main(String[] args) {

        int a = 2 ;
        int b = 4;
        double c= Math.sqrt(a);
//        System.out.println(c);

        long result = 1;
        while(b != 0){
            result *= a;
            --b;
        }
        System.out.println("luy thua la :" + result);
    }
}
