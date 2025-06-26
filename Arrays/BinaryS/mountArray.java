/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        //  Find the peak index
        int peak = findPeak(mountainArr, 0, n - 1);

        //  Binary search in the increasing part
        int left = binarySearch(mountainArr, target, 0, peak, true);
        if (left != -1) return left;

        //  Binary search in the decreasing part
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    private int findPeak(MountainArray arr, int low, int high) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                low = mid + 1; // move right
            } else {
                high = mid; // move left
            }
        }
        return low; // peak index
    }

    private int binarySearch(MountainArray arr, int target, int low, int high, boolean ascending) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = arr.get(mid);
            if (val == target) return mid;

            if (ascending) {
                if (val < target) low = mid + 1;
                else high = mid - 1;
            } else {
                if (val > target) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }
}
