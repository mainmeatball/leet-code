package org.leetcode.problem;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.ListNode;

import static org.junit.jupiter.api.Assertions.*;


class Solution2130Test {

    final Solution2130 solution = new Solution2130();

    @Test
    void pairSum() {
        final ListNode four = new ListNode(3);
        final ListNode three = new ListNode(2, four);
        final ListNode two = new ListNode(2, three);
        final ListNode one = new ListNode(4, two);

        int result = solution.pairSum(one);

        assertEquals(7, result);
    }

    @Test
    void pairSumTwoNodes() {
        final ListNode two = new ListNode(2);
        final ListNode one = new ListNode(4, two);

        int result = solution.pairSum(one);

        assertEquals(6, result);
    }
}