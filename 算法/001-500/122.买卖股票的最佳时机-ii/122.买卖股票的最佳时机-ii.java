/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 * 
 * 200/200 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 16.3 % of java submissions (41.6 MB)
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for(int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) ans += prices[i] - prices[i - 1];
        }
        return ans;
    }
}
// @lc code=end

