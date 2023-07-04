package org.leetcode.problem;

import java.util.Set;


/**
 * Maximum Number of Vowels in a Substring of Given Length
 */
public class Solution1456 {

    private final static Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

    public int maxVowels(String s, int k) {
        int max = 0, sum = 0;
        final char[] chars = s.toCharArray();
        for (int i = 0; i < k; i++) {
            sum += isVowel(chars[i]);
            max = sum;
        }
        for (int i = k; i < chars.length; i++) {
            sum -= isVowel(chars[i - k]);
            sum += isVowel(chars[i]);
            if (sum > max) max = sum;
            if (max == k) return max;
        }
        return max;
    }

    private int isVowel(final char ch) {
        return vowels.contains(ch) ? 1 : 0;
    }
}
