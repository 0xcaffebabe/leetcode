/*
 * @lc app=leetcode.cn id=剑指 Offer II 089 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 089] 房屋偷盗
 * 
 * 68/68 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 14.77 % of java submissions (39.1 MB)
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



/*
// @lcpr case=start
// [1,2,3,1]\n
// @lcpr case=end

// @lcpr case=start
// [2,7,9,3,1]\n
// @lcpr case=end

 */

