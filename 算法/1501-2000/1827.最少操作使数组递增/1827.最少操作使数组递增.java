/*
 * @lc app=leetcode.cn id=1827 lang=java
 *
 * [1827] 最少操作使数组递增
 * 
 * 94/94 cases passed (2 ms)
 * Your runtime beats 87.17 % of java submissions
 * Your memory usage beats 84.31 % of java submissions (41.7 MB)
 */

// @lc code=start
class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) continue;
            ans += nums[i - 1] - nums[i] + 1;
            nums[i] += nums[i - 1] - nums[i] + 1;
        }
        return ans;
    }
}
// @lc code=end

