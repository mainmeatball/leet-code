package org.leetcode.weekly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RemoveAllAdjacentDuplicatesInString2Test {

    private final RemoveAllAdjacentDuplicatesInString2 task = new RemoveAllAdjacentDuplicatesInString2();

    @Test
    void test() {
        final String result = task.removeDuplicates("abcd", 2);

        assertEquals("abcd", result);
    }

    @Test
    void test2() {
        final String result = task.removeDuplicates("deeedbbcccbdaa", 3);

        assertEquals("aa", result);
    }

    @Test
    void test3() {
        final String result = task.removeDuplicates("pbbcggttciiippooaais", 2);

        assertEquals("ps", result);
    }
}