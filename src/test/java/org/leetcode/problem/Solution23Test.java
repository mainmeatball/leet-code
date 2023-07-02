package org.leetcode.problem;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.ListNode;

import static org.junit.jupiter.api.Assertions.*;


class Solution23Test {

    final Solution23 solution = new Solution23();

    @Test
    void mergeKLists() {
        final ListNode five = new ListNode(5);
        final ListNode four = new ListNode(4, five);
        final ListNode three = new ListNode(3, four);
        final ListNode two = new ListNode(2, three);
        final ListNode one = new ListNode(1, two);

        final ListNode five2 = new ListNode(5);
        final ListNode four2 = new ListNode(4, five2);
        final ListNode three2 = new ListNode(3, four2);
        final ListNode two2 = new ListNode(2, three2);
        final ListNode one2 = new ListNode(1, two2);

        ListNode result = solution.mergeKLists(new ListNode[] {one, one2});

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}