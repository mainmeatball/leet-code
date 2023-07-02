package org.leetcode.weekly;

import org.leetcode.structure.ListNode;


public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(final ListNode head, final int n) {
        int length = 0;
        for (ListNode node = head; node != null; node = node.next) {
            length++;
        }
        int i = 0;
        ListNode prev = null;
        for (ListNode node = head; node != null; node = node.next, i++) {
            if (length - n == i) {
                if (prev == null) {
                    return node.next;
                }
                prev.next = node.next;
                return head;
            }
            prev = node;
        }
        return head;
    }
}
