package org.leetcode.problem;

import java.util.LinkedList;
import java.util.Queue;


/**
 * Number of Recent Calls
 */
public class Solution933 {

    class RecentCounter {

        int min;
        final Queue<Integer> q;

        public RecentCounter() {
            min = 0;
            q = new LinkedList<>();
        }

        public int ping(int t) {
            if (q.isEmpty()) {
                min = t;
            }
            q.add(t);
            if (t - min <= 3000) {
                return q.size();
            }
            while (!q.isEmpty()) {
                final int next = q.element();
                if (t - next <= 3000) {
                    break;
                }
                q.poll();
                min = q.element();
            }
            return q.size();
        }
    }
}
