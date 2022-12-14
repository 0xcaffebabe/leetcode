/*
 * @lc app=leetcode.cn id=63 lang=java
 *
 * [63] 不同路径 II
 * 
 * 41/41 cases passed (1 ms)
 * Your runtime beats 5.07 % of java submissions
 * Your memory usage beats 46.84 % of java submissions (39.6 MB)
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[m - 1][n - 1] == 1) return 0;

        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                dp[i][0] = 0;
                break;
            }
            else dp[i][0] = 1;
        }
        for(int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                dp[0][i] = 0;
                break;
            }
            else dp[0][i] = 1;
        }
        for(int i = 1; i < m; i++) {
            
            for(int j = 1; j < n; j++) {
                int top = dp[i][j - 1];
                int right = dp[i - 1][j];
                if (obstacleGrid[i][j - 1] == 1) top = 0;
                if (obstacleGrid[i - 1][j] == 1) right = 0;
                dp[i][j] = top + right;
                if (obstacleGrid[i][j] == 1) dp[i][j] = 0;
            }
        }
        return dp[m - 1][n - 1];
    }
}
// @lc code=end

