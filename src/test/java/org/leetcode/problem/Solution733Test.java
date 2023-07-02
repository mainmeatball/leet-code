package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution733Test {

    final Solution733 solution = new Solution733();

    @Test
    void floodFill() {
        final int[][] image = new int[][]{{1,1,1},{1,1,0},{1,0,1}};

        final int[][] result = solution.floodFill(image, 1, 1, 2);

        for (final int[] ints : result) {
            for (final int anInt : ints) {
                System.out.print(anInt + ",");
            }
            System.out.println(" ");
        }
    }

    @Test
    void floodFill2() {
        final int[][] image = new int[][]{{0,0,0},{0,0,0}};

        final int[][] result = solution.floodFill(image, 0, 0, 0);

        for (final int[] ints : result) {
            for (final int anInt : ints) {
                System.out.print(anInt + ",");
            }
            System.out.println(" ");
        }
    }
}