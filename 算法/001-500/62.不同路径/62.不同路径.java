/*
 * @lc app=leetcode.cn id=62 lang=java
 *
 * [62] 不同路径
 * 
 * 63/63 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 21.31 % of java submissions (38.5 MB)
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++) dp[i][0] = 1;
        for(int i = 0; i < n; i++) dp[0][i] = 1;
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
        }
        return dp[m - 1][n - 1];
    }
}
// @lc code=end

