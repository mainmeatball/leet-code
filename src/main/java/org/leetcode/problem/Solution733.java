package org.leetcode.problem;

/**
 * Flood Fill
 */
public class Solution733 {

    boolean[][] visited;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        visited = new boolean[image.length][image[0].length];
        final int startingColor = image[sr][sc];
        if (startingColor == color) {
            return image;
        }
        helper(image, sr, sc, startingColor, color);
        return image;
    }

    private void helper(final int[][] image, final int x, final int y, final int startingColor, final int color) {
        if (x < 0 || y < 0 || x >= image.length || y >= image[0].length) {
            return;
        }
        if (visited[x][y]) {
            return;
        }
        if (image[x][y] != startingColor) {
            return;
        }
        image[x][y] = color;
        helper(image, x - 1, y, startingColor, color);
        helper(image, x, y - 1, startingColor, color);
        helper(image, x + 1, y, startingColor, color);
        helper(image, x, y + 1, startingColor, color);
    }
}
