package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution649Test {

    final Solution649 solution = new Solution649();

    @Test
    void predictPartyVictory() {
        final String result = solution.predictPartyVictory("RD");

        assertEquals("Radiant", result);
    }

    @Test
    void predictPartyVictory2() {
        final String result = solution.predictPartyVictory("RDD");

        assertEquals("Dire", result);
    }

    @Test
    void predictPartyVictory3() {
        final String result = solution.predictPartyVictory("RRRRR");

        assertEquals("Radiant", result);
    }

    @Test
    void predictPartyVictory4() {
        final String result = solution.predictPartyVictory("DDDDD");

        assertEquals("Dire", result);
    }

    @Test
    void predictPartyVictory5() {
        final String result = solution.predictPartyVictory("R");

        assertEquals("Radiant", result);
    }

    @Test
    void predictPartyVictory6() {
        final String result = solution.predictPartyVictory("D");

        assertEquals("Dire", result);
    }

    @Test
    void predictPartyVictory7() {
        final String result = solution.predictPartyVictory("RDDRD");

        assertEquals("Dire", result);
    }

    @Test
    void predictPartyVictory8() {
        final String result = solution.predictPartyVictory("RRDDD");

        assertEquals("Radiant", result);
    }

    @Test
    void predictPartyVictory9() {
        final String result = solution.predictPartyVictory("DDDDRRDDDRDRDRRDDRDDDRDRRRRDRRRRRDRDDRDDRRDDRRRDDRRRDDDDRRRRRRRDDRRRDDRDDDRRRDRDDRDDDRRDRRDRRRDRDRDR");

        assertEquals("Dire", result);
    }
}