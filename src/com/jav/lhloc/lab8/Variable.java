package com.jav.lhloc.lab8;

import com.jav.lhloc.lab5.SinhVien;

public class Variable {

    public static void main(String[] args) {
        Variable variable = new Variable();// doi tuong/object
        Variable variable1 = new Variable();// doi tuong/object
        Variable variable2 = new Variable();// doi tuong/object
        Variable variable3 = new Variable();// doi tuong/object

        int number = 5;
        number = variable.updateNumber(number);//update thanh 10
        System.out.println(number); //=> 10

//        int[] array = {5}; //=> array[0] = 5
//        variable.updateArray(array);
//        System.out.println(array[0]);

//        SinhVien sinhVien = new SinhVien();
//        sinhVien.setPoint(5.0f);
//        variable.updateSinhVien(sinhVien);
//        System.out.println(sinhVien.getPoint());

//        int total = variable.sum(2,4, 5, 8,5,5,5,54,0,3,6,9);
//        System.out.println(total);
    }

    private int sum(int ...abc) {
        int total = 0;

        //Xu ly rat la nhieu
        for(int i = 0; i < abc.length; i++) {
            total += abc[i];
        }

        return total;
    }

    private int updateNumber(int number) {

        int a = 10;

        //xu ly rat la nhieu

        return a;
    }

    private void updateArray(int[] array) {
        array[0] = 10;
    }

    private void updateSinhVien(SinhVien sinhVien) {
        sinhVien.setPoint(10.0f);
    }


}
