package org.leetcode.problem;

/**
 * N-th Tribonacci Number
 */
public class Solution1137 {

    public int tribonacci(int n) {
        if (n <= 1) return n;
        if (n == 2) return 1;
        int trib0 = 0, trib1 = 1, trib2 = 1;
        for (int i = 0; i < n; i++) {
            final int temp0 = trib0, temp1 = trib1;
            trib0 = trib1;
            trib1 = trib2;
            trib2 += temp0 + temp1;
        }
        return trib2;
    }
}
