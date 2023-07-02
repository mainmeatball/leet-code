package org.leetcode.structure;

import org.junit.jupiter.api.Test;


class MyLinkedListTest {

    @Test
    void test() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1,2);
        list.get(1);
        list.deleteAtIndex(0);
        list.get(0);
    }

    @Test
    void test2() {
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(1);
        list.get(0);
    }

    @Test
    void test3() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(2);
        list.deleteAtIndex(1);
        list.addAtHead(2);
        list.addAtHead(7);
        list.addAtHead(3);
        list.addAtHead(2);
        list.addAtHead(5);
        list.addAtTail(5);
        list.get(5);
        list.deleteAtIndex(6);
        list.deleteAtIndex(4);
    }

}