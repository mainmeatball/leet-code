package org.leetcode.problem;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * Permutation in String
 */
public class Solution567 {
    public boolean checkInclusion(String s1, String s2) {
        int[] set = new int[26];
        final int[] set2 = new int[26];
        final Set<Character> set1 = new HashSet<>();
        boolean setModified = false;

        for (int i = 0; i < s1.length(); i++) {
            set[s1.charAt(i) - 'a']++;
            set2[s1.charAt(i) - 'a']++;
            set1.add(s1.charAt(i));
        }

        int currentLength = 0;

        int returnPoint = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (set[s2.charAt(i) - 'a'] > 0) {
                set[s2.charAt(i) - 'a']--;
                currentLength++;
                setModified = true;
            } else {
                if (setModified) {
                    set = Arrays.copyOf(set2, set2.length);
                }
                currentLength = 0;
                setModified = false;
                if (set1.contains(s2.charAt(i))) {
                    i = returnPoint;
                    returnPoint++;
                } else {
                    returnPoint = i;
                }
            }
            if (currentLength == s1.length()) {
                return true;
            }
        }
        return false;
    }
}
