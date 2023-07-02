package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1146Test {

    final Solution1146 solution = new Solution1146();

    @Test
    public void test1() {
        final Solution1146.SnapshotArray a = solution.new SnapshotArray(3);
        a.set(0, 5);

        final int snapId = a.snap();
        assertEquals(0, snapId);

        a.set(0, 6);
        final int result = a.get(0, snapId);
        assertEquals(5, result);
    }

    @Test
    public void test2() {
        final Solution1146.SnapshotArray a = solution.new SnapshotArray(3);

        final int result = a.get(0, 1);

        assertEquals(0, result);
    }

    @Test
    public void test3() {
        final Solution1146.SnapshotArray a = solution.new SnapshotArray(3);

        a.set(0, 2);
        a.set(0, 3);
        a.set(0, 4);

        final int result = a.get(0, 0);

        assertEquals(4, result);
    }

    @Test
    public void test4() {
        final Solution1146.SnapshotArray a = solution.new SnapshotArray(3);

        a.set(0, 0); // snap0
        a.snap();
        a.set(0, 1); // snap1
        a.snap();
        a.set(0, 2); // snap2
        a.snap();
        a.set(0, 3); // snap3
        a.snap();
        a.set(0, 4); // snap4
        a.snap();
        a.set(0, 5); // snap5
        a.snap();
        a.set(0, 6); // snap6
        a.snap();

        assertEquals(0, a.get(0, 0));
        assertEquals(1, a.get(0, 1));
        assertEquals(2, a.get(0, 2));
        assertEquals(3, a.get(0, 3));
        assertEquals(4, a.get(0, 4));
        assertEquals(5, a.get(0, 5));
        assertEquals(6, a.get(0, 6));
    }

    @Test
    public void test5() {
        final Solution1146.SnapshotArray a = solution.new SnapshotArray(1);

        a.set(0, 15);
        a.snap();
        a.snap();
        a.snap();

        assertEquals(15, a.get(0, 2));
        a.snap();
        a.snap();

        assertEquals(15, a.get(0, 0));
    }

    @Test
    public void test6() {
        final Solution1146.SnapshotArray a = solution.new SnapshotArray(3);

        a.set(1, 18);
        a.set(1, 4); // snap0
        a.snap();

        assertEquals(0, a.get(0, 0));

        a.set(0, 20); // snap1

        a.snap();

        a.set(0, 2); // snap2
        a.set(1, 1); // snap2
        assertEquals(4, a.get(1, 1));
        assertEquals(4, a.get(1, 0));
    }
}