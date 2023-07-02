package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1790Test {

    final Solution1790 solution = new Solution1790();

    @Test
    void areAlmostEqual() {
      final boolean result = solution.areAlmostEqual("bank", "kanb");

      assertTrue(result);
    }

    @Test
    void areAlmostEqual2() {
      final boolean result = solution.areAlmostEqual("attack", "defend");

      assertFalse(result);
    }

    @Test
    void areAlmostEqual3() {
        final boolean result = solution.areAlmostEqual("popp", "popp");

        assertTrue(result);
    }

    @Test
    void areAlmostEqual4() {
        final boolean result = solution.areAlmostEqual("papp", "popp");

        assertFalse(result);
    }
}