package org.leetcode.problem;

/**
 * Check if One String Swap Can Make Strings Equal
 */
public class Solution1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int i1 = -1;
        int i2 = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (i1 == -1) {
                    i1 = i;
                } else if (i2 == -1) {
                    i2 = i;
                } else {
                    return false;
                }
            }
        }
        if (i1 == -1) {
            return true;
        }
        if (i2 == -1) {
            return false;
        }
        return s1.charAt(i1) == s2.charAt(i2) && s1.charAt(i2) == s2.charAt(i1);
    }
}
