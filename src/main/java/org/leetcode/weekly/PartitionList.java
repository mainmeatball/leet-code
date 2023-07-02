package org.leetcode.weekly;

import org.leetcode.structure.ListNode;


public class PartitionList {

    public ListNode partition(ListNode head, final int x) {
        ListNode maxHead = null;
        ListNode maxCurr = null;

        ListNode prev = null;
        for (ListNode node = head; node != null; node = node.next) {
            if (maxCurr != null) {
                maxCurr.next = null;
            }
            if (node.val >= x) {
                if (maxHead == null) {
                    maxHead = node;
                } else {
                    maxCurr.next = node;
                }
                if (prev != null) {
                    prev.next = node.next;
                }
                if (node == head) {
                    head = head.next;
                }
                maxCurr = node;
            } else {
                prev = node;
            }
        }
        if (prev == null) {
            return head == null ? maxHead : head;
        }
        prev.next = maxHead;
        return head;
    }
}
