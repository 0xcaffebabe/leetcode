import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 * 
 * 68/68 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 16.67 % of java submissions (39.1 MB)
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if (nums.length == 1) return nums[0];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        // System.out.println(Arrays.toString(dp));
        int max = 0;
        for(var i : dp) max = Math.max(max, i);
        
        return max;
    }
}
// @lc code=end

