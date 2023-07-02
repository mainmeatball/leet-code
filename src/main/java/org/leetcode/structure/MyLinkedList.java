package org.leetcode.structure;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;


public class MyLinkedList {

    public int val = -1;

    public int length = 0;

    public MyLinkedList next = null;

    public MyLinkedList head = null;

    public MyLinkedList tail = null;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
    }

    public MyLinkedList(int val) {
        this.val = val;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index >= length) {
            return -1;
        }
        MyLinkedList curr = head;
        while (index > 0) {
            curr = curr.next;
            index--;
        }
        return curr.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the
     * linked list.
     */
    public void addAtHead(int val) {
        MyLinkedList elem = new MyLinkedList(val);
        elem.next = head;
        if (head == null) {
            tail = elem;
        }
        head = elem;
        length++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        MyLinkedList elem = new MyLinkedList(val);
        if (tail != null) {
            tail.next = elem;
        }
        tail = elem;
        if (head == null) {
            head = tail;
        }
        length++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be
     * appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == length - 1) {
            addAtTail(val);
            return;
        }
        MyLinkedList prev = null;
        MyLinkedList curr = head;
        while (index > 0) {
            prev = curr;
            curr = curr.next;
            index--;
        }
        MyLinkedList elem = new MyLinkedList();
        elem.val = val;
        elem.next = curr;
        if (prev != null) {
            prev.next = elem;
        }
        length++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length) {
            return;
        }
        if (index == 0) {
            deleteHead();
            return;
        }
        if (index == length - 1) {
            deleteTail();
            return;
        }
        MyLinkedList prev = null;
        MyLinkedList curr = head;
        while (index > 0) {
            prev = curr;
            curr = curr.next;
            index--;
        }
        prev.next = curr.next;
        length--;
    }

    private void deleteHead() {
        head = head.next;
        length--;
    }

    private void deleteTail() {
        MyLinkedList curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next.next = null;
        tail = curr.next;
        length--;
    }
}
