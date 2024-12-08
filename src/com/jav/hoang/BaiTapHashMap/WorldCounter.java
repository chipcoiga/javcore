package com.jav.hoang.BaiTapHashMap;

import java.util.HashMap;

public class WorldCounter {
    public static void main(String[] args) {
        String textCandem = "Chung Toi La Chung Toi Chung ";
        countTextAndFindMaxText(textCandem);
    }

    public static void countTextAndFindMaxText(String text){
    HashMap <String, Integer > map = new HashMap<String , Integer>();
    String lowCase = text.toLowerCase();
    String[] tachText = lowCase.split(" ");
    String key = "";
    Integer value = 0 ;
    int max = 0 ;

    //get key -> value



    for (int i = 0 ; i< tachText.length;i++) {
        key = tachText[i];//chung toi la chung toi chung
        if (map.containsKey(key)) {
            value = map.get(key);
            map.put(key, value + 1);
        } else {
            map.put(key, 1);
        }
    }
        System.out.println("So thu tu lap lai cua cac Text la :");
        System.out.println(map);
        if (map.get(key)> max){
            max = map.get(key);
        }
        System.out.println("Text Xuat Hien Nhieu Nhat la :");
        System.out.println("Text : " + key + " So lan :" + max);
    }
}


