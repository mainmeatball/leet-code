package org.leetcode.problem;


import org.leetcode.structure.ListNode;


/**
 * Maximum Twin Sum of a Linked List
 */
public class Solution2130 {
    public int pairSum(ListNode head) {
        ListNode cur = head;
        int size = 0;
        while (cur.next != null) {
            cur = cur.next;
            size++;
        }

        int headOfSecondHalfIndex = (size + 1) / 2;

        cur = head;
        while (headOfSecondHalfIndex > 0) {
            cur = cur.next;
            headOfSecondHalfIndex--;
        }

        ListNode secondHalfHead = reverseList(cur);

        int max = 0;
        while (secondHalfHead != null) {
            max = Math.max(max, head.val + secondHalfHead.val);
            head = head.next;
            secondHalfHead = secondHalfHead.next;
        }
        return max;
    }

    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode cur = head.next;
        prev.next = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
