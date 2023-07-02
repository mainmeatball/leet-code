package org.leetcode.problem;

/**
 * Fibonacci Number
 */
public class Solution509 {

    public int fib(int n) {
        if (n <= 1) return n;
        int fib0 = 0, fib1 = 1;
        for (int i = 0; i < n; i++) {
            fib0 += fib1;
            fib1 = fib0 - fib1;
        }
        return fib0;
    }

}
