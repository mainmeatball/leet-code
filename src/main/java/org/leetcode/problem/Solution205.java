package org.leetcode.problem;

/**
 * Isomorphic Strings
 */
public class Solution205 {

    public boolean isIsomorphic(String s, String t) {
        final char[] sMap = new char[256];
        final char[] tMap = new char[256];

        for (int i = 0; i < s.length(); i++) {
            final char sCh = s.charAt(i);
            final char tCh = t.charAt(i);
            final char transformedValue = sMap[sCh]; // t value

            if (transformedValue == 0) { // new char from s string
                // check that the result of transformation haven't been used yet

                if (tMap[tCh] != 0 && tMap[tCh] != sCh) {
                    // if another sCh was already transformed to this tCh
                    return false;
                }

                sMap[sCh] = tCh;
                tMap[tCh] = sCh;
            } else if (transformedValue != tCh) {
                return false;
            }
        }
        return true;
    }
}
