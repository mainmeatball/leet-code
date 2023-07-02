package org.leetcode.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Snapshot Array
 */
class Solution1146 {

    class SnapshotArray {

        ArrayList[] arr;
        int currentSnap = 0;

        public SnapshotArray(int length) {
            arr = new ArrayList[length];
        }

        public void set(int index, int val) {
            final ArrayList<SnapAndValue> value = arr[index];
            final ArrayList<SnapAndValue> newVal = value == null ? new ArrayList<>() : value;
            if (newVal.size() > 0 && newVal.get(newVal.size() - 1).snapId == currentSnap) {
                newVal.get(newVal.size() - 1).value = val;
                return;
            }
            newVal.add(new SnapAndValue(currentSnap, val));
            arr[index] = newVal;
        }

        public int snap() {
            currentSnap++;
            return currentSnap - 1;
        }

        public int get(int index, int snap_id) {
            final ArrayList<SnapAndValue> list = arr[index];
            if (list == null || list.size() == 0) {
                return 0;
            }
            final SnapAndValue firstSnap = list.get(0);
            if (firstSnap.snapId == snap_id) {
                return firstSnap.value;
            }
            if (firstSnap.snapId > snap_id) {
                return 0;
            }

            int i = Integer.MAX_VALUE;
            int low = 0;
            int high = list.size() - 1;

            while (low <= high) {
                int mid = low  + ((high - low) / 2);
                final int foundSnapId = list.get(mid).snapId;
                if (foundSnapId < snap_id) {
                    low = mid + 1;
                    i = mid;
                } else if (foundSnapId > snap_id) {
                    high = mid - 1;
                    i = mid;
                } else if (foundSnapId == snap_id) {
                    return list.get(mid).value;
                }
            }

            if (list.get(i).snapId <= snap_id) {
                return list.get(i).value;
            }

            if (i > 0) {
                return list.get(i - 1).value;
            }

            return 0;
        }
    }

    class SnapAndValue {
        int snapId;
        int value;

        public SnapAndValue(int snapId, int value) {
            this.snapId = snapId;
            this.value = value;
        }
    }
}