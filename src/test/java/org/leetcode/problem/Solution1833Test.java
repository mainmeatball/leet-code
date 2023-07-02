package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Solution1833Test {

    private final Solution1833 task = new Solution1833();

    @Test
    void test() {
        final int res = task.maxIceCream(new int[] {1, 3, 2, 4, 1}, 7);

        assertEquals(4, res);
    }

    @Test
    void test2() {
        final int res = task.maxIceCream(new int[] {10, 6, 8, 7, 7, 8}, 5);

        assertEquals(0, res);
    }

    @Test
    void test3() {
        final int res = task.maxIceCream(new int[] {1, 6, 3, 1, 2, 5}, 20);

        assertEquals(6, res);
    }
}