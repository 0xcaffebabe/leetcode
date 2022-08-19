/*
 * @lc app=leetcode.cn id=162 lang=java
 *
 * [162] 寻找峰值
 * 
 * 63/63 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 67.79 % of java submissions (40.7 MB)
 */

// @lc code=start
class Solution {
    int[] nums;
    public int findPeakElement(int[] nums) {
        this.nums = nums;
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int mid = (l + r) / 2;
        while(l <= r) {
            mid = (l + r) / 2;
            if (get(mid - 1) < get(mid) && get(mid) > get(mid + 1)) return mid;
            if (get(mid) < get(mid + 1)) {
                // 往右上山
                l = mid + 1;
            }else {
                // 往左上山
                r = mid;
            }
        }
        return -1;
    }
    long get(int i) {
        if (i == -1 || i == nums.length) return Long.MIN_VALUE;
        return nums[i];
    }
}
// @lc code=end

