package com.jav.hoang.MapBaiTapChatGPT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddDeleteViewInMap {
    public static void main(String[] args) {
        Map<String, Double> Food = new HashMap<>();
        AddFood(Food);
       ViewMap(Food);
        Remove(Food);
    }
        public static void AddFood (Map<String, Double> Add){
            Scanner scanner = new Scanner(System.in);
            int i = 0;

            do {
            System.out.println("Nhap ten Mon an vao day");
            String key = scanner.nextLine();
            System.out.println("Nhap gia mon an vao day ");
            Double value = scanner.nextDouble();
            Add.put(key,value);
            i++;
            scanner.nextLine();

            }
            while (i < 2);

        }
        public static void ViewMap(Map<String, Double> viewMap){
            System.out.println("Full Map View : ");
        for (Map.Entry<String , Double > item : viewMap.entrySet()){
            System.out.println(item.getKey() + "-" + item.getValue());
        }

        }
        public static void Remove(Map<String, Double> removeElement){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap key can remove");

            String key = scanner.nextLine();

        removeElement.remove(key);

        System.out.println("Sau khi remove thi con lai : ");
        System.out.println(removeElement);
        }
}
