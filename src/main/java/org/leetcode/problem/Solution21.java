package org.leetcode.problem;

import org.leetcode.structure.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        final ListNode result = new ListNode(-1);
        ListNode resCurr = result;
        while (true) {
            if (l2 == null) {
                resCurr.next = l1;
                break;
            }
            if (l1 == null) {
                resCurr.next = l2;
                break;
            }
            if (l1.val < l2.val) {
                resCurr.next = l1;
                l1 = l1.next;
            } else {
                resCurr.next = l2;
                l2 = l2.next;
            }
            resCurr = resCurr.next;
        }
        return result.next;
    }
}
