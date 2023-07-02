package org.leetcode.weekly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @author sstepanov
 */
class ShortestDistanceToACharacterTest {

    private final ShortestDistanceToACharacter task = new ShortestDistanceToACharacter();

    @Test
    public void multipleOccurrences() {
        final int[] result = task.shortestToChar("loveleetcode", 'e');
        compareArrays(new int[]{3,2,1,0,1,0,0,1,2,2,1,0}, result);
    }

    @Test
    public void singleOccurrence() {
        final int[] result = task.shortestToChar("aaab", 'b');
        compareArrays(new int[]{3,2,1,0}, result);
    }

    @Test
    public void singleLetter() {
        final int[] result = task.shortestToChar("a", 'a');
        compareArrays(new int[]{0}, result);
    }

    @Test
    public void allOccurrences() {
        final int[] result = task.shortestToChar("aaaaaaaa", 'a');
        compareArrays(new int[]{0,0,0,0,0,0,0,0}, result);
    }

    private void compareArrays(final int[] expected, final int[] actual) {
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}