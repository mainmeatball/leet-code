package org.leetcode.weekly;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.ListNode;
import org.leetcode.utils.ListNodeUtils;


class RemoveNthNodeFromEndOfListTest {

    private final RemoveNthNodeFromEndOfList task = new RemoveNthNodeFromEndOfList();

    @Test
    void test() {
        final ListNode head = ListNodeUtils.createLinkedList(1, 2, 3, 4, 5);

        final ListNode result = task.removeNthFromEnd(head, 2);

        ListNodeUtils.printLinkedList(result);
    }

    @Test
    void test2() {
        final ListNode head = ListNodeUtils.createLinkedList(1);

        final ListNode result = task.removeNthFromEnd(head, 1);

        ListNodeUtils.printLinkedList(result);
    }

    @Test
    void test3() {
        final ListNode head = ListNodeUtils.createLinkedList(1, 2);

        final ListNode result = task.removeNthFromEnd(head, 1);

        ListNodeUtils.printLinkedList(result);
    }
}