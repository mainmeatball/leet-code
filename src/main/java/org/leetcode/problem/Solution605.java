package org.leetcode.problem;

/**
 * Can Place Flowers
 */
public class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        for (int i = 0; i < flowerbed.length; i++) {
            final int left = i == 0 ? 0 : flowerbed[i - 1];
            final int right = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
            if (left + flowerbed[i] + right == 0) {
                flowerbed[i] = 1;
                n--;
            }
            if (n == 0) return true;
        }
        return false;
    }
}
