package com.company.first.Palindrome;

import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {
    public static void main(String[] args) {
        CheckPermutation c = new CheckPermutation();

        String str1 = "abcddd";
        String str2 = "cddabd";

        boolean result = c.calculate(str1, str2);
        System.out.println("First string: " + str1 + "\nSecond string: " + str2 + "\nPermutation exist: " + result);
    }

    public Map<Character, Integer> fillMap(String str) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int occurrence = charMap.get(character) != null ? charMap.get(character) + 1 : 1;

            charMap.put(character, occurrence);
        }

        return charMap;
    }

    public Boolean calculate(String str1, String str2) {
        Map<Character, Integer> strOneMap = fillMap(str1);
        Map<Character, Integer> strTwoMap = fillMap(str2);

        return strOneMap.equals(strTwoMap);
    }
}
