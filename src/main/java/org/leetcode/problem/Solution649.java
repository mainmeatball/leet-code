package org.leetcode.problem;


/**
 * Dota2 Senate
 */
public class Solution649 {
    public String predictPartyVictory(String senate) {
        final char[] arr = senate.toCharArray();
        int votedR = 0, votedD = 0, killR = 0, killD = 0;
        final StringBuilder newSenate = new StringBuilder();
        for (final char c : arr) {
            if (c == 'R') {
                if (killR != 0) {
                    killR--;
                } else {
                    votedR++;
                    newSenate.append('R');
                    killD++;
                }
            } else {
                if (killD != 0) {
                    killD--;
                } else {
                    votedD++;
                    newSenate.append('D');
                    killR++;
                }
            }
        }
        final StringBuilder newSenate2 = new StringBuilder();
        for (final char c : newSenate.toString().toCharArray()) {
            if (c == 'R') {
                if (killR == 0) {
                    newSenate2.append('R');
                } else {
                    killR--;
                }
            } else {
                if (killD == 0) {
                    newSenate2.append('D');
                } else {
                    killD--;
                }
            }
        }
        votedR -= killR;
        votedD -= killD;
        if (votedR <= 0) {
            return "Dire";
        }
        if (votedD <= 0) {
            return "Radiant";
        }
        return predictPartyVictory(newSenate2.toString());
    }
}
