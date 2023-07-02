package org.leetcode.problem;


/**
 * Decrypt String from Alphabet to Integer Mapping
 */
public class Solution1309 {
    public String freqAlphabets(String s) {
        final StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            final char ch = s.charAt(i);
            if (ch == '#') {
                sb.append((char)charsToInt(s.charAt(i - 2), s.charAt(i - 1)));
                i -= 2;
            } else {
                sb.append((char)(ch - '0' + 'a' - 1));
            }
        }
        return sb.reverse().toString();
    }

    private int charsToInt(final char ch1, final char ch2) {
        final int ch = (ch1 - '0') * 10 + (ch2 - '0');
        return ch + 'a' - 1;
    }
}
