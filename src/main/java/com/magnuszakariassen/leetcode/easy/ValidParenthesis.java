package com.magnuszakariassen.leetcode.easy;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        ArrayDeque<Character> paranthesisStack = new ArrayDeque<>();
        Map<Character, Character> openCloseParanthesesMap = new HashMap<>();
        openCloseParanthesesMap.put('(', ')');
        openCloseParanthesesMap.put('{', '}');
        openCloseParanthesesMap.put('[', ']');

        for (char currentCharacter : s.toCharArray()) {
            if (openCloseParanthesesMap.containsKey(currentCharacter)) {
                paranthesisStack.push(currentCharacter);
            } else {
                if (paranthesisStack.isEmpty()) {
                    return false;
                }
                Character topOfStack = paranthesisStack.peek();
                if (openCloseParanthesesMap.get(topOfStack) == currentCharacter) {
                    paranthesisStack.pop();
                } else {
                    return false;
                }

            }
        }
        return paranthesisStack.isEmpty();
    }
}
