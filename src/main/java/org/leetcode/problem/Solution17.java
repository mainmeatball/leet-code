package org.leetcode.problem;

import java.util.*;


/**
 * Letter Combinations of a Phone Number
 */
public class Solution17 {

    private final String[] letters = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        int combinationListSize = 1;
        for (int i = 0; i < digits.length(); i++) {
            final char c = digits.charAt(i);
            final int digit = c - '0';
            combinationListSize *= letters[digit].length();
        }

        final List<String> combinations = new ArrayList<>(combinationListSize);

        final Queue<String> queue = new LinkedList<>();
        queue.add("");

        while (!queue.isEmpty()) {
            String s = queue.remove();

            if (s.length() == digits.length()) {
                combinations.add(s);
            } else {
                String val = letters[digits.charAt(s.length()) - '0'];
                for (int i = 0; i < val.length(); i++) {
                    queue.add(s + val.charAt(i));
                }
            }
        }

        return combinations;
    }
}
