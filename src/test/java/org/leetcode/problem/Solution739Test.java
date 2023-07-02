package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution739Test {

    final Solution739 solution = new Solution739();

    @Test
    void dailyTemperatures() {
        final int[] temps = new int[] {73,74,75,71,69,72,76,73};

        final int[] result = solution.dailyTemperatures(temps);

        for (final int j : result) {
            System.out.print(j);
            System.out.print(", ");
        }
    }

    @Test
    void dailyTemperaturesDesc() {
        final int[] temps = new int[] {10,9,8,7,6,5,4,3,2,1,0};

        final int[] result = solution.dailyTemperatures(temps);

        for (final int j : result) {
            System.out.print(j);
            System.out.print(", ");
        }
    }

    @Test
    void dailyTemperaturesAsc() {
        final int[] temps = new int[] {0,1,2,3,4,5,6,7,8,9,10};

        final int[] result = solution.dailyTemperatures(temps);

        for (final int j : result) {
            System.out.print(j);
            System.out.print(", ");
        }
    }

    @Test
    void dailyTemperaturesEq() {
        final int[] temps = new int[] {10,10,10,10,20};

        final int[] result = solution.dailyTemperatures(temps);

        for (final int j : result) {
            System.out.print(j);
            System.out.print(", ");
        }
    }
}