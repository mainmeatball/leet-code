package org.leetcode.problem;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.ListNode;

import static org.junit.jupiter.api.Assertions.*;


class Solution876Test {

    final Solution876 solution = new Solution876();

    @Test
    void middleNodeEven() {
        final ListNode six = new ListNode(6);
        final ListNode five = new ListNode(5, six);
        final ListNode four = new ListNode(4, five);
        final ListNode three = new ListNode(3, four);
        final ListNode two = new ListNode(2, three);
        final ListNode one = new ListNode(1, two);

        final ListNode result = solution.middleNode(one);

        System.out.println(result.val);
    }

    @Test
    void middleNodeOdd() {
        final ListNode five = new ListNode(5);
        final ListNode four = new ListNode(4, five);
        final ListNode three = new ListNode(3, four);
        final ListNode two = new ListNode(2, three);
        final ListNode one = new ListNode(1, two);

        final ListNode result = solution.middleNode(one);

        System.out.println(result.val);
    }
}