package org.leetcode.problem;


/**
 * String Compression
 */
public class Solution443 {
    public int compress(char[] chars) {
        int result = 0;
        char curChar = chars[0];
        int cur = 1;
        int j = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i-1]) {
                cur++;
            } else {
                final int prevj = j;
                j = insertToArray(chars, j, curChar, cur);
                result += (j - prevj);
                cur = 1;
                curChar = chars[i];
            }
        }
        final int prevj = j;
        j = insertToArray(chars, j, curChar, cur);
        result += (j - prevj);
        return result;
    }

    private int insertToArray(char[] chars, int j, char letter, int n) {
        final String s = String.valueOf(n);
        chars[j++] = letter;
        if (n == 1) {
            return j;
        }
        for (int i = 0; i < s.length(); i++) {
            chars[j++] = s.charAt(i);
        }
        return j;
    }
}
