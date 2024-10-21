/*
 * @lc app=leetcode.cn id=LCR 166 lang=java
 * @lcpr version=
 *
 * [LCR 166] 珠宝的最高价值
 * 
 * 61/61 cases passed (2 ms)
 * Your runtime beats 92.8 % of java submissions
 * Your memory usage beats 19.6 % of java submissions (44.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int jewelleryValue(int[][] dp) {
        int m = dp.length;
        int n = dp[0].length;
        for(int i = 1; i < n; i++) dp[0][i] += dp[0][i - 1];
        for(int i = 1; i < m; i++) dp[i][0] += dp[i - 1][0];

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++)
                dp[i][j] += Math.max(dp[i-1][j], dp[i][j-1]);
        }

        return dp[m - 1][n - 1];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,3,1],[1,5,1],[4,2,1]]\n
// [[1]]\n
// [[1],[2]]\n
// [[1,2]]\n
// @lcpr case=end

 */

