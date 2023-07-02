package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution443Test {

    final Solution443 solution = new Solution443();

    @Test
    void compress() {
        char[] array = new char[]{'a','a','b','b','c','c','c'};
        assertEquals(6, solution.compress(array));
        assertArrayEquals(new char[]{'a','2','b','2','c','3'}, array);
    }

    @Test
    void compress2() {
        char[] array = new char[]{'a'};
        assertEquals(1, solution.compress(array));
        assertArrayEquals(new char[]{'a'}, array);
    }

    @Test
    void compress3() {
        char[] array = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        assertEquals(4, solution.compress(array));
        assertArrayEquals(new char[]{'a','b','1','2'}, array);
    }
}