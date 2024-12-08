package com.jav.hoang.BaiTapThrowGPT;

public class Bai1 {

    public static void main(String[] args) {
        try {
            divideNumber(10,0);
        } catch (ExceptionChia0 e) {
            System.out.println(e.getMessage());

        }
    }
    public static int divideNumber  (int chia,int soBiChia ) throws ExceptionChia0 {
        if (soBiChia == 0) {
            throw new ExceptionChia0("Khong duoc chia 0");
        }
return   chia / soBiChia;
    }

}
