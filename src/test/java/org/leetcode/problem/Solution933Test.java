package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution933Test {

    final Solution933 solution = new Solution933();

    @Test
    void ping1() {
        final Solution933.RecentCounter rc = solution.new RecentCounter();

        assertEquals(1, rc.ping(1));
        assertEquals(2, rc.ping(100));
        assertEquals(3, rc.ping(3001));
        assertEquals(3, rc.ping(3002));
    }

    @Test
    void ping2() {
        final Solution933.RecentCounter rc = solution.new RecentCounter();

        assertEquals(1, rc.ping(825));
        assertEquals(2, rc.ping(2295));
        assertEquals(2, rc.ping(4131));
        assertEquals(2, rc.ping(5455));
        assertEquals(3, rc.ping(5884));
        assertEquals(4, rc.ping(5975));
    }
}