package com.jav.lhloc.lab211;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        String text = getInputText();
        Map<String, Integer> wordCountMap = countWords(text.toLowerCase());
        findMaxWord(wordCountMap);
    }

    private static void findMaxWord(Map<String, Integer> wordCountMap) {
        int maxCount = 0;
        String maxWord = "";
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        }
        System.out.println("The word is: " + maxWord + " with " + maxCount + " times");
    }

    private static Map<String, Integer> countWords(String text) {
        String[] words = text.split(" ");
        return countWords(words);
    }

    private static Map<String, Integer> countWords(String[] words) {
        if (words == null || words.length == 0) {
            return new HashMap<>();
        }

        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        return wordCountMap;
    }

    private static String getInputText() {
        return "Chung ta la sinh vien truong Dai hoc Bach Khoa Ha Noi. " +
                "Chung ta hoc rat cham chi va co gang. " +
                "Chung ta se tro thanh ky su gio";
    }
}
