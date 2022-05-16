package com.magnuszakariassen.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ValidParantheses {
    public static boolean isValid(String s) {
        Map<String, String> openCloseParanthesesMap = new HashMap<>();
        openCloseParanthesesMap.put("(", ")");
        openCloseParanthesesMap.put("{", "}");
        openCloseParanthesesMap.put("[", "]");

        for (int i = 1; i < s.length() ; i+=2) {
            var openingParanthesis = s.substring(i-1, i);
            if (!s.substring(i, i+1).equals(openCloseParanthesesMap.get(openingParanthesis))) {
                return false;
            }
        }
        return true;
    }
}
