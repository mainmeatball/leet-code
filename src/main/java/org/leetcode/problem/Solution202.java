package org.leetcode.problem;

import java.util.HashSet;
import java.util.Set;


/**
 * Happy Number
 */
public class Solution202 {
    public boolean isHappy(int n) {
        final Set<Integer> set = new HashSet<>();
        while (true) {
            if (n == 1) {
                return true;
            }
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            n = sumOfSquares(n);
        }
    }

    private int sumOfSquares(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}
