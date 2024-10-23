package com.jav.lhloc.lab210.old;

import java.util.ArrayList;

public class MainProcess {

    public static void main(String[] args) {
        ArrayList<HocSinh> hs = nhapDanhDachHocSinh();

        System.out.println("So luong hoc sinh: " + hs.size());

        ArrayList<String> lops = new ArrayList<>();
        for(int i = 0; i< hs.size(); i++){

            HocSinh hocSinh = hs.get(i);
            String lopCuaHocSinh = hocSinh.getLop();

            if(!lops.contains(lopCuaHocSinh)){
                lops.add(lopCuaHocSinh);
            }
        }

        System.out.println("Danh sach lop: " + lops.size());
        for(int i = 0; i< lops.size(); i++){
            System.out.println(lops.get(i));
        }

        //=======================
        int[] countHs = new int[lops.size()];
        for (int i = 0; i < countHs.length; i++) {
            countHs[i] = 0;
        }

        for(int i = 0; i< lops.size(); i++) {
            String lop = lops.get(i); //i=0 -> Lop 1A

            for(int j = 0; j < hs.size(); j++) {
                HocSinh hocSinh = hs.get(j);
                if(hocSinh.getLop().equals(lop)) {
                    countHs[i]++;
                }
            }
        }

        System.out.println("So hoc sinh cua tung lop: ");
        for(int i = 0; i< lops.size(); i++) {
            System.out.println("Lop: " + lops.get(i) + " co so hoc sinh: " + countHs[i]);
        }

    }

    private static ArrayList<HocSinh> nhapDanhDachHocSinh() {

        ArrayList<HocSinh> hs = new ArrayList<>();
        hs.add(new HocSinh("Hoc Sinh 1", "Lop 1A"));
        hs.add(new HocSinh("Hoc Sinh 2", "Lop 1B"));
        hs.add(new HocSinh("Hoc Sinh 3", "Lop 1A"));
        hs.add(new HocSinh("Hoc Sinh 4", "Lop 1C"));
        hs.add(new HocSinh("Hoc Sinh 5", "Lop x"));
        return hs;
    }
}
