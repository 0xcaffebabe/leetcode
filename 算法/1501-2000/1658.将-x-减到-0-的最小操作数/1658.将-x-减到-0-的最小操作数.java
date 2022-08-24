/*
 * @lc app=leetcode.cn id=1658 lang=java
 *
 * [1658] 将 x 减到 0 的最小操作数
 * 
 * 94/94 cases passed (4 ms)
 * Your runtime beats 96.67 % of java submissions
 * Your memory usage beats 63.67 % of java submissions (50.5 MB)
 */

// @lc code=start
class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(var i : nums) sum += i;
        int max = -1;
        int left = 0;
        int right = 0;
        int cur = 0;
        while(right < nums.length) {
            // 右边界扩张
            cur += nums[right++];
            // 如果当前累加和大于目标值，窗口左边界收缩
            while(cur > sum - x && left < nums.length) cur -= nums[left++];
            if (cur == sum - x) max = Math.max(max, right - left);
        }
        return max == -1 ? -1 : nums.length - max;
    }
}
// @lc code=end

