package com.jav.lhloc.lab210.current;

import java.util.*;

public class MainProcess {

    public static void main(String[] args) {
        ArrayList<HocSinh> hs = nhapDanhDachHocSinh();
//
//        System.out.println("So luong hoc sinh: " + hs.size());
//
//        Map<String, Integer> countMap = new HashMap<>();
//
//        for (HocSinh hocSinh : hs) {
//            String lop = hocSinh.getLop();
//
//            if (countMap.containsKey(lop)) {
//                int currentCount = countMap.get(lop);
//                countMap.put(lop, currentCount + 1);
//            } else {
//                countMap.put(lop, 1);
//            }
//        }

        HashSet<String> set = new HashSet();
        set.add("5");// set[0]= 5 ;List[0]= 5
        set.add("6");// set[1]= 6 ;List[1]= 6
        set.add("9");// set[2]= 9 ;List[2]= 9
        set.add("8");

        for (String lop : set) {
            System.out.println(lop);
        }

        System.out.println("======");
        List<String> list = new ArrayList<>();
        list.add("5");// set[0]= 5 ;List[0]= 5
        list.add("6");// set[1]= 6 ;List[1]= 6
        list.add("9");// set[2]= 9 ;List[2]= 9
        list.add("8");

        for (String lop : list) {
            System.out.println(lop);
        }

//
//        System.out.println("So hoc sinh cua tung lop: ");
//        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
//            System.out.println("Lop: " + entry.getKey() + " co so hoc sinh: " + entry.getValue());
//        }
//
//        for (int i = 0; i< countMap.entrySet().size(); i++) {
//            System.out.println("Lop: " + countMap.entrySet() + " co so hoc sinh: " + countMap.entrySet().toArray()[i]);
//        }

//        for(String lop : countMap.keySet()){
//            int count = countMap.get(lop);
//            System.out.println("Lop: " + lop + " co so hoc sinh: " + count);
//        }
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
