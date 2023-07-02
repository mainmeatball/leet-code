package org.leetcode.problem;

import org.leetcode.structure.ListNode;

import java.util.*;


/**
 * Merge k Sorted Lists
 */
public class Solution23 {

    private final static Comparator<ListNode> MIN_HEAP_COMPARATOR = Comparator.comparingInt(o -> o.val);

    public ListNode mergeKLists(ListNode[] lists) {
        final PriorityQueue<ListNode> heap = new PriorityQueue<>(lists.length * 500, MIN_HEAP_COMPARATOR);

        for (final ListNode list : lists) {
            ListNode cur = list;
            while (cur != null) {
                heap.offer(cur);
                cur = cur.next;
            }
        }

        ListNode cur = heap.poll();
        final ListNode head = cur;
        while (cur != null) {
            final ListNode next = heap.poll();
            cur.next = next;
            cur = next;
        }

        return head;
    }
}
