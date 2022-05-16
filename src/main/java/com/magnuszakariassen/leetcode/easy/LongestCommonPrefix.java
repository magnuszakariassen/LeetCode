package com.magnuszakariassen.leetcode.easy;

/***
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] words) {
        String commonPrefix = words[0];

        for (int i = 1; i < words.length; i++) {
            while (words[i].indexOf(commonPrefix) != 0) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                if(commonPrefix.isEmpty()) return "";
            }

        }
        return commonPrefix;
    }
}
