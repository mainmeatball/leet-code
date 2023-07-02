package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class Solution841Test {

    final Solution841 solution = new Solution841();

    @Test
    void canVisitAllRooms() {
        final List<List<Integer>> rooms = List.of(
                List.of(1, 3),
                List.of(3, 0, 1),
                List.of(2),
                List.of(0)
        );

        final boolean canVisit = solution.canVisitAllRooms(rooms);

        assertFalse(canVisit);
    }
}