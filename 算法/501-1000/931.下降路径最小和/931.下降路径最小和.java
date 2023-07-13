/*
 * @lc app=leetcode.cn id=931 lang=java
 * @lcpr version=21909
 *
 * [931] 下降路径最小和
 * 
 * 50/50 cases passed (4 ms)
 * Your runtime beats 75.88 % of java submissions
 * Your memory usage beats 7.12 % of java submissions (43.5 MB)
 */

// @lc code=start
class Solution {
    public int minFallingPathSum(int[][] dp) {
        int n = dp.length;
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (j == 0) 
                    dp[i][j] += Math.min(dp[i - 1][j], dp[i - 1][j + 1]);
                else if (j == n - 1)
                    dp[i][j] += Math.min(dp[i - 1][j], dp[i - 1][j - 1]);
                else 
                    dp[i][j] += Math.min(dp[i - 1][j + 1] ,
                        Math.min(dp[i - 1][j], dp[i - 1][j - 1]));
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if (dp[n - 1][i] <= ans) ans = dp[n - 1][i];
        }
        return ans;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [[2,1,3],[6,5,4],[7,8,9]]\n
// @lcpr case=end

// @lcpr case=start
// [[-19,57],[-40,-5]]\n
// [[1]]\n
// @lcpr case=end

 */

