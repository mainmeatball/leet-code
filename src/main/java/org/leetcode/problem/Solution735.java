package org.leetcode.problem;

import java.util.Stack;


/**
 * Asteroid Collision
 */
public class Solution735 {
    public int[] asteroidCollision(int[] asteroids) {
        final Stack<Integer> stack = new Stack<>();
        for (final int asteroid : asteroids) {
            stack.push(asteroid);
            while (true) {
                if (stack.size() <= 1) {
                    break;
                }
                final int curr = stack.pop();
                final int prev = stack.pop();
                if (!areGoingToCollapse(prev, curr)) {
                    stack.push(prev);
                    stack.push(curr);
                    break;
                }
                if (Math.abs(prev) > Math.abs(curr)) {
                    stack.push(prev);
                }
                else if (Math.abs(prev) < Math.abs(curr)) {
                    stack.push(curr);
                }
            }
        }

        final int[] answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }

    private boolean areGoingToCollapse(int a, int b) {
        return a > 0 && b < 0;
    }
}
