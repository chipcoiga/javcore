package com.jav.hoang.LuyenTap;

public class ThuatToan {
    public static void main(String[] args) {
        int [] soLonNhat = {9,3,22,16,29,40,-1,-5};

        double max = soLonNhat[0];
        for (int num : soLonNhat){
            if (max < num){
                max = num;
            }
        }
        System.out.println(max);
        }


        }

