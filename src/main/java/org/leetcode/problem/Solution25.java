package org.leetcode.problem;

import org.leetcode.structure.ListNode;


/**
 * Reverse Nodes in k-Group
 */
public class Solution25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }

        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            size++;
        }
        final int numberOfGroups = Math.floorDiv(size, k);

        ListNode prevGroupLast = null;
        ListNode newHead = null;
        cur = head;
        for (int i = 0; i < numberOfGroups; i++) {
            final ReverseLinkedListGroupResult result = reverseLinkedListGroup(cur, k);
            if (prevGroupLast != null) {
                prevGroupLast.next = result.head;
            }
            result.tail.next = result.nextGroupHead;
            prevGroupLast = result.tail;
            if (i == 0) {
                newHead = result.head;
            }
            cur = result.nextGroupHead;
        }

        return newHead;
    }

    private ReverseLinkedListGroupResult reverseLinkedListGroup(ListNode head, int reverseLength) {
        ListNode prev = head;
        ListNode cur = head.next;
        prev.next = null;
        for (int i = 0; i < reverseLength - 1; i++) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return new ReverseLinkedListGroupResult(prev, head, cur);
    }

    private static class ReverseLinkedListGroupResult {
        private ListNode head;
        private ListNode tail;
        private ListNode nextGroupHead;

        private ReverseLinkedListGroupResult(final ListNode head, final ListNode tail, final ListNode nextGroupHead) {
            this.head = head;
            this.tail = tail;
            this.nextGroupHead = nextGroupHead;
        }
    }

}
