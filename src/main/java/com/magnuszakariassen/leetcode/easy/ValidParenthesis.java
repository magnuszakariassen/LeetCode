package com.magnuszakariassen.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> paranthesisStack = new Stack();
        Map<Character, Character> openCloseParanthesesMap = new HashMap<>();
        openCloseParanthesesMap.put('(', ')');
        openCloseParanthesesMap.put('{', '}');
        openCloseParanthesesMap.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            Character currentCharacter = s.charAt(i);
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
