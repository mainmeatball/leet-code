package org.leetcode.problem;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.ListNode;


class Solution25Test {

    final Solution25 solution = new Solution25();

    @Test
    void reverseKGroup() {
        final ListNode five = new ListNode(5);
        final ListNode four = new ListNode(4, five);
        final ListNode three = new ListNode(3, four);
        final ListNode two = new ListNode(2, three);
        final ListNode one = new ListNode(1, two);

        ListNode result = solution.reverseKGroup(one, 2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    void reverseKGroupWholeList() {
        final ListNode five = new ListNode(5);
        final ListNode four = new ListNode(4, five);
        final ListNode three = new ListNode(3, four);
        final ListNode two = new ListNode(2, three);
        final ListNode one = new ListNode(1, two);

        ListNode result = solution.reverseKGroup(one, 5);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    void reverseKGroupKDivides() {
        final ListNode six = new ListNode(6);
        final ListNode five = new ListNode(5, six);
        final ListNode four = new ListNode(4, five);
        final ListNode three = new ListNode(3, four);
        final ListNode two = new ListNode(2, three);
        final ListNode one = new ListNode(1, two);

        ListNode result = solution.reverseKGroup(one, 3);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}