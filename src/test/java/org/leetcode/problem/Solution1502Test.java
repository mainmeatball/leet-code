package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1502Test {

    final Solution1502 solution = new Solution1502();

    @Test
    void canMakeArithmeticProgression() {
      final int[] arr = new int[]{3,5,1};

      final boolean result = solution.canMakeArithmeticProgression(arr);

      assertTrue(result);
    }

  @Test
  void canMakeArithmeticProgression2() {
    final int[] arr = new int[]{2,1,4};

    final boolean result = solution.canMakeArithmeticProgression(arr);

    assertFalse(result);
  }
}