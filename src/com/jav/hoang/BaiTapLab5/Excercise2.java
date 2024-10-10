package com.jav.hoang.BaiTapLab5;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Excercise2 {
    public static void main(String[] args) {
        String kiTuFirst = "14";
        String kiTuSecond = "229";
//        String[] kiTuOfKiTuFirst = kiTuFirst.split("");
//        String[] kiTuOfKiTuSecond = kiTuSecond.split("");
           try{
                int a = Integer.parseInt(kiTuFirst);
                int b = Integer.parseInt(kiTuSecond);
                int c = a+b;
               System.out.println(c);
           }catch (Exception e ){
               System.out.println("Nhập kí tự số vào đê ");
           }

    }

}
