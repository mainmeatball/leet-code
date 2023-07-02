package org.leetcode.problem;

import org.leetcode.structure.ListNode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


/**
 * Reverse Linked List
 */
public class Solution206 {

    public ListNode reverseList(ListNode head) {
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
