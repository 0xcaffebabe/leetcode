/*
 * @lc app=leetcode.cn id=剑指 Offer II 099 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 099] 最小路径之和
 * 
 * 61/61 cases passed (2 ms)
 * Your runtime beats 92.58 % of java submissions
 * Your memory usage beats 88.95 % of java submissions (42.8 MB)
 */

// @lc code=start
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // dp[i][j] 代表从[0,0]到[i,j]的最小成本
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int i = 1; i < m; i++) dp[i][0] += dp[i-1][0] + grid[i][0];
        for(int i = 1; i < n; i++) dp[0][i] += dp[0][i-1] + grid[0][i];
        // print(dp);
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
        }
        return dp[m-1][n-1];
    }
    void print(int[][] dp) {
        for(var i : dp) {
            for(var j : i) System.out.print(j + " ");
            System.out.println();
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,3,1],[1,5,1],[4,2,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,2,3],[4,5,6]]\n
// @lcpr case=end

 */

