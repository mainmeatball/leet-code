package org.leetcode.weekly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MoveZeroesTest {

    private final MoveZeroes task = new MoveZeroes();

    @Test
    void test() {
        int[] array = new int[]{0,1,0,3,12};
        task.moveZeroes(array);
        assertArrayEquals(new int[]{1,3,12,0,0}, array);
    }

    @Test
    void test2() {
        int[] array = new int[]{0};
        task.moveZeroes(array);
        assertArrayEquals(new int[]{0}, array);
    }

    @Test
    void test3() {
        int[] array = new int[]{0,1,0,3,0,4,5,6,0,0,0,0,1,0,5};
        task.moveZeroes(array);
        assertArrayEquals(new int[]{1,3,4,5,6,1,5,0,0,0,0,0,0,0,0}, array);
    }
}