package org.leetcode.problem;


import org.leetcode.structure.ListNode;


/**
 * Delete the Middle Node of a Linked List
 */
public class Solution2095 {
    public ListNode deleteMiddle(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while (cur.next != null) {
            size++;
            cur = cur.next;
        }

        int removeIndex = (size + 1) / 2;

        ListNode prev = null;
        cur = head;
        while (removeIndex > 0) {
            prev = cur;
            cur = cur.next;
            removeIndex--;
        }

        if (prev != null) {
            prev.next = cur.next;
            return head;
        } else {
            return cur.next;
        }
    }
}
