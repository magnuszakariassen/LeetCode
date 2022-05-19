package com.magnuszakariassen.leetcode.easy;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static boolean isValid(String s) {
        ArrayDeque<Character> parenthesesStack = new ArrayDeque<>();
        Map<Character, Character> openCloseParanthesisMap = createOpenCloseParanthesisMap();

        for (char currentCharacter : s.toCharArray()) {
            if (openCloseParanthesisMap.containsKey(currentCharacter)) {
                parenthesesStack.push(currentCharacter);
            } else {
                if (parenthesesStack.isEmpty()) {
                    return false;
                }
                char topOfStack = parenthesesStack.pop();
                if (openCloseParanthesisMap.get(topOfStack) != currentCharacter) {
                    return false;
                }
            }
        }
        return parenthesesStack.isEmpty();
    }

    private static Map<Character, Character> createOpenCloseParanthesisMap() {
        Map<Character, Character> openCloseParanthesesMap = new HashMap<>();
        openCloseParanthesesMap.put('(', ')');
        openCloseParanthesesMap.put('{', '}');
        openCloseParanthesesMap.put('[', ']');
        return openCloseParanthesesMap;
    }
}
