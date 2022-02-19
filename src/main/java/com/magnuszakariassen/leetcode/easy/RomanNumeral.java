package com.magnuszakariassen.leetcode.easy;

import java.util.HashMap;

public class RomanNumeral {

    public static int romanToInt(String romanNumber) {

        HashMap<Character, Integer> romanToIntMap = getRomanToIntMap();

        int sum = 0;

        int currentNumeral = romanToIntMap.get(romanNumber.charAt(0));
        int nextNumeral;

        for(int i = 1; i< romanNumber.length(); i++){

            nextNumeral = romanToIntMap.get(romanNumber.charAt(i));

            if (nextNumeral > currentNumeral) {
                sum = sum - currentNumeral;
            } else {
                sum = sum + currentNumeral;
            }
            currentNumeral = nextNumeral;
        }
        sum = sum + currentNumeral;
        return sum;

    }

    private static HashMap<Character, Integer> getRomanToIntMap() {
        HashMap<Character, Integer> romanToIntMap = new HashMap<Character, Integer>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
        return romanToIntMap;
    }
}
