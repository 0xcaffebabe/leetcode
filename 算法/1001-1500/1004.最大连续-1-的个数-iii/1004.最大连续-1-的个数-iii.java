/*
 * @lc app=leetcode.cn id=1004 lang=java
 *
 * [1004] 最大连续1的个数 III
 * 
 * 52/52 cases passed (2 ms)
 * Your runtime beats 99.93 % of java submissions
 * Your memory usage beats 37.07 % of java submissions (43 MB)
 */

// @lc code=start
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, sum = 0;
        for(; right < nums.length; right++) {
            sum += nums[right];
            // 窗口大小超过要求了 向右移动
            if (right - left + 1 > sum + k) {
                sum -= nums[left];
                left++;
            }
        }
        return right - left;
    }
}
// @lc code=end

