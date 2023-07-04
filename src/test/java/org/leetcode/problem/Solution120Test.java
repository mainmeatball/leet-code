package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class Solution120Test {

    final Solution120 solution = new Solution120();

    @Test
    public void minimumTotal() {
        final int result = solution.minimumTotal(List.of(
                List.of(2),
                List.of(3,4),
                List.of(6,5,7),
                List.of(4,1,8,3)
            ));

        assertEquals(11, result);
    }

    @Test
    public void minimumTotal2() {
        final int result = solution.minimumTotal(List.of(
                List.of(-10)
        ));

        assertEquals(-10, result);
    }

}