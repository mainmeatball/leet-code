package org.leetcode.problem;


/**
 * Find Smallest Letter Greater Than Target
 */
public class Solution744 {
    public char nextGreatestLetter(char[] letters, char target) {
        for (final char letter : letters) {
            if (letter > target) return letter;
        }
        return letters[0];
    }
}
