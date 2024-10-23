package com.jav.lhloc.lab29;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);

        Map<Integer, Integer> map = new HashMap<>();


        //Cho một arraylist chứa số nguyên
        //Hãy loại bỏ các số trùng lặp
        //Ví dụ: [1, 2, 3, 4, 5, 1, 2, 3] -> [1, 2, 3, 4, 5]

        System.out.println("Before remove duplicate: ");
        printList(list);

        System.out.println("\nAfter remove duplicate: ");
        List<Integer> result = removeDuplicate(list);
        printList(result);

        System.out.println("\nUsing hashset: ");
        Set<Integer> set0 = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(5);
        set.add(5);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(4);
        set.add(4);
        set.add(4);
        set.add(4);
        System.out.println("\nHashSet: ");
        printSet(set);
    }

    private static List<Integer> removeDuplicate(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    j--;
                }
            }
        }

        return list;
    }

    private static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static void printSet(HashSet<Integer> set) {
//        for (Integer i : set) {
//            System.out.print(i + " ");
//        }
//
        ArrayList<Integer> list = new ArrayList<>(set);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
