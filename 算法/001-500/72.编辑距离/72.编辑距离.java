/*
 * @lc app=leetcode.cn id=72 lang=java
 *
 * [72] 编辑距离
 * 
 * 1146/1146 cases passed (4 ms)
 * Your runtime beats 88.46 % of java submissions
 * Your memory usage beats 20.7 % of java submissions (41.7 MB)
 */

// @lc code=start
class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if (m * n == 0) return n + m;

        // dp[i][j] = word1[0..i]变成word2[0..j]的最小操作
        // dp[i][j] = 最小值(上方, 左方, 左上方)
        int[][] dp = new int[m + 1][n + 1];

        for(int i = 1; i <= m; i++) dp[i][0] = i;
        for(int i = 1; i <= n; i++) dp[0][i] = i;

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                int top = dp[i-1][j] +1;
                int left = dp[i][j-1] + 1;
                int cur = dp[i-1][j-1];
                if (word1.charAt(i - 1) != word2.charAt(j-1)) cur++;
                dp[i][j] = Math.min(cur, Math.min(top,left));
            }
        }
        return dp[m][n];
    }
}
// @lc code=end

