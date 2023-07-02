package org.leetcode.problem;

import java.util.Arrays;


/**
 * Can Make Arithmetic Progression From Sequence
 */
public class Solution1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length <= 2) {
            return true;
        }
        Arrays.sort(arr);
        for (int i = 0; i + 2 < arr.length; i++) {
            if (arr[i+2] - arr[i+1] != arr[i+1] - arr[i]) {
                return false;
            }
        }
        return true;
    }
}
