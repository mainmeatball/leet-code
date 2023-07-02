package org.leetcode.utils;

import org.leetcode.structure.ListNode;

import java.util.List;


public class ListNodeUtils {

    public static ListNode createLinkedList(final Integer... elements) {
        if (elements.length == 0) {
            return null;
        }
        final List<Integer> elementList = List.of(elements);
        final ListNode head = new ListNode(elementList.get(0));
        ListNode prev = head;
        for (int i = 1; i < elementList.size(); i++) {
            final ListNode node = new ListNode(elementList.get(i));
            prev.next = node;
            prev = node;
        }
        return head;
    }

    public static void printLinkedList(final ListNode head) {
        for (ListNode node = head; node != null; node = node.next) {
            System.out.println(node.val);
        }
    }
}
