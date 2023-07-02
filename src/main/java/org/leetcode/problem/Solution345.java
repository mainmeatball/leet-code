package org.leetcode.problem;


/**
 * Reverse Vowels of a String
 */
public class Solution345 {
    public String reverseVowels(String s) {
        final StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            final char ch = s.charAt(i);
            if (isVowel(ch)) sb.append(ch);
        }
        final String vowels = sb.toString();
        int vowelIndex = 0;
        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            final char ch = s.charAt(i);
            final char charToAppend = isVowel(ch) ? vowels.charAt(vowelIndex++) : ch;
            result.append(charToAppend);
        }
        return result.toString();
    }

    private boolean isVowel(final char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
