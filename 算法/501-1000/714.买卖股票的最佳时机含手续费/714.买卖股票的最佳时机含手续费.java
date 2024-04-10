/*
 * @lc app=leetcode.cn id=714 lang=java
 * @lcpr version=
 *
 * [714] 买卖股票的最佳时机含手续费
 * 
 * 44/44 cases passed (20 ms)
 * Your runtime beats 50.98 % of java submissions
 * Your memory usage beats 21.13 % of java submissions (53.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][1] = -prices[0];
        dp[0][0] = 0;

        for(int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i] - fee);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
        }
        return Math.max(dp[n - 1][1], dp[n - 1][0]);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1, 3, 2, 8, 4, 9]\n2\n
// [1]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,3,7,5,10,3]\n3\n
// @lcpr case=end

 */

