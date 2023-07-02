package org.leetcode.problem;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.ListNode;

import static org.junit.jupiter.api.Assertions.*;


class Solution206Test {

    final Solution206 solution = new Solution206();

    @Test
    void reverseList() {
        final ListNode five = new ListNode(5);
        final ListNode four = new ListNode(4, five);
        final ListNode three = new ListNode(3, four);
        final ListNode two = new ListNode(2, three);
        final ListNode one = new ListNode(1, two);

        ListNode result = solution.reverseList(one);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}