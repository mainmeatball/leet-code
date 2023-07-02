package org.leetcode.problem;

import java.util.HashMap;
import java.util.Map;


/**
 * Roman to Integer
 */
public class Solution13 {

    private static Map<String, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put("I", 1);
        romanMap.put("IV", 4);
        romanMap.put("V", 5);
        romanMap.put("IX", 9);
        romanMap.put("X", 10);
        romanMap.put("XL", 40);
        romanMap.put("L", 50);
        romanMap.put("XC", 90);
        romanMap.put("C", 100);
        romanMap.put("CD", 400);
        romanMap.put("D", 500);
        romanMap.put("CM", 900);
        romanMap.put("M", 1000);
    }

    public int romanToInt(final String s) {
        int res = 0;
        for (int i = 0; i < s.length();) {
            if (s.length() - i >= 2) {
                final String bigram = s.substring(i, i + 2);
                if (romanMap.containsKey(bigram)) {
                    res += romanMap.get(bigram);
                    i += 2;
                } else {
                    res += romanMap.get(String.valueOf(s.charAt(i)));
                    i++;
                }
            } else {
                res += romanMap.get(String.valueOf(s.charAt(i)));
                i++;
            }
        }
        return res;
    }
}
