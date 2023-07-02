package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution202Test {

    final Solution202 solution = new Solution202();

    @Test
    void isHappy() {
      final int nineteen = 19;

      final boolean result = solution.isHappy(nineteen);

      assertTrue(result);
    }

  @Test
  void isHappy2() {
    final int two = 2;

    final boolean result = solution.isHappy(two);

    assertFalse(result);
  }
}