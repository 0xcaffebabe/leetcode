/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 * 
 * 47/47 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 83.43 % of java submissions (41.8 MB)
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while(start <= end) {
            mid = (start + end) / 2;
            if (target == nums[mid]) return mid;
            if (target < nums[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
// @lc code=end

