/*
 * @lc app=leetcode.cn id=剑指 Offer 14- I lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer 14- I] 剪绳子
 * 
 * 50/50 cases passed (1 ms)
 * Your runtime beats 49.7 % of java submissions
 * Your memory usage beats 35.23 % of java submissions (38.3 MB)
 */

// @lc code=start
class Solution {
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int max = 0;
            for (int j = 1; j < i; j++)
                max = Math.max(max, Math.max(j * (i - j), j * dp[i - j]));
            dp[i] = max;
        }
        return dp[n];
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n
// @lcpr case=end

// @lcpr case=start
// 10\n
// @lcpr case=end

 */

