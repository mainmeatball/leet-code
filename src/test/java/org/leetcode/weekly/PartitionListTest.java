package org.leetcode.weekly;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.ListNode;
import org.leetcode.utils.ListNodeUtils;


class PartitionListTest {

    private final PartitionList task = new PartitionList();

    @Test
    void test() {
        final ListNode head = ListNodeUtils.createLinkedList(1, 4, 3, 2, 5, 2);

        final ListNode result = task.partition(head, 3);

        ListNodeUtils.printLinkedList(result);
    }

    @Test
    void test2() {
        final ListNode head = ListNodeUtils.createLinkedList(2, 1);

        final ListNode result = task.partition(head, 2);

        ListNodeUtils.printLinkedList(result);
    }

    @Test
    void test3() {
        final ListNode head = ListNodeUtils.createLinkedList(1);

        final ListNode result = task.partition(head, 0);

        ListNodeUtils.printLinkedList(result);
    }
}