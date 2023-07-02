package org.leetcode.problem;

import org.leetcode.structure.ListNode;


/**
 * Middle of the Linked List
 */
public class Solution876 {

    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            size++;
        }

        int middle = size / 2;
        cur = head;
        for (int i = 0; i < middle; i++) {
            cur = cur.next;
        }

        return cur;
    }

}
