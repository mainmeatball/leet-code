package org.leetcode.problem;

import java.util.*;


/**
 * Integer to Roman
 */
public class Solution12 {

    private static Map<Integer, String> romanMap = new HashMap<>();

    static {
        romanMap.put(1, "I");
        romanMap.put(4, "IV");
        romanMap.put(5, "V");
        romanMap.put(9, "IX");
        romanMap.put(10, "X");
        romanMap.put(40, "XL");
        romanMap.put(50, "L");
        romanMap.put(90, "XC");
        romanMap.put(100, "C");
        romanMap.put(400, "CD");
        romanMap.put(500, "D");
        romanMap.put(900, "CM");
        romanMap.put(1000, "M");
    }

    public String intToRoman(int num) {
        final StringBuilder res = new StringBuilder();
        int decimalPlace = 1;
        final Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            final int number = num % 10 * decimalPlace;
            stack.push(number);
            num /= 10;
            decimalPlace *= 10;
        }
        while (!stack.isEmpty()) {
            res.append(resolveNumber(stack.pop()));
        }
        return res.toString();
    }

    private String resolveNumber(int num) {
        final StringBuilder res = new StringBuilder();
        while (num > 0) {
            final var entry = getNearest(num);
            num -= entry.getKey();
            res.append(entry.getValue());
        }
        return res.toString();
    }

    private Map.Entry<Integer, String> getNearest(final int num) {
        return romanMap.entrySet().stream()
                .filter(entry -> entry.getKey() <= num)
                .max(Comparator.comparingInt(Map.Entry::getKey))
                .orElseThrow(() -> new IllegalStateException("Something went wrong"));
    }
}
