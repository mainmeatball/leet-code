package org.leetcode.problem;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.ListNode;
import org.leetcode.utils.ListNodeUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Solution21Test {

    private final Solution21 solution = new Solution21();

    @Test
    void test() {
        final ListNode l1 = ListNodeUtils.createLinkedList(1, 2, 4);
        final ListNode l2 = ListNodeUtils.createLinkedList(1, 3, 4);

        final ListNode result = solution.mergeTwoLists(l1, l2);

        ListNodeUtils.printLinkedList(result);
    }

    @Test
    void test2() {
        final ListNode l1 = ListNodeUtils.createLinkedList();
        final ListNode l2 = ListNodeUtils.createLinkedList();

        final ListNode result = solution.mergeTwoLists(l1, l2);

        ListNodeUtils.printLinkedList(result);
    }

    @Test
    void test3() {
        final ListNode l1 = ListNodeUtils.createLinkedList();
        final ListNode l2 = ListNodeUtils.createLinkedList(0);

        final ListNode result = solution.mergeTwoLists(l1, l2);

        ListNodeUtils.printLinkedList(result);
    }
}