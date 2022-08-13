/*
 * @lc app=leetcode.cn id=96 lang=java
 *
 * [96] 不同的二叉搜索树
 * 
 * 19/19 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 62.6 % of java submissions (38.2 MB)
 */

// @lc code=start
class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            for(int j = 1; j <= i; j++) dp[i] += dp[j - 1] * dp[i - j];
        }
        return dp[n];
    }
}
// @lc code=end

