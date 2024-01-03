package org.leetcode.problem;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.ListNode;

import static org.junit.jupiter.api.Assertions.*;


class Solution2095Test {

    final Solution2095 solution = new Solution2095();

    @Test
    void deleteMiddleOdd() {
        final ListNode five = new ListNode(5);
        final ListNode four = new ListNode(4, five);
        final ListNode three = new ListNode(3, four);
        final ListNode two = new ListNode(2, three);
        final ListNode one = new ListNode(1, two);

        ListNode result = solution.deleteMiddle(one);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    void deleteMiddleEven() {
        final ListNode four = new ListNode(4);
        final ListNode three = new ListNode(3, four);
        final ListNode two = new ListNode(2, three);
        final ListNode one = new ListNode(1, two);

        ListNode result = solution.deleteMiddle(one);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    void deleteMiddleEvenSmall() {
        final ListNode two = new ListNode(2);
        final ListNode one = new ListNode(1, two);

        ListNode result = solution.deleteMiddle(one);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    void deleteMiddleSizeOne() {
        final ListNode one = new ListNode(1);

        ListNode result = solution.deleteMiddle(one);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}