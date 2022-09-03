/*
 * @lc app=leetcode.cn id=583 lang=java
 *
 * [583] 两个字符串的删除操作
 * 
 * 1306/1306 cases passed (5 ms)
 * Your runtime beats 94.4 % of java submissions
 * Your memory usage beats 78.98 % of java submissions (41.8 MB)
 */

// @lc code=start
class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++) {
            char c1 = word1.charAt(i - 1);
            for(int j = 1; j <= n; j++) {
                char c2 = word2.charAt(j - 1);
                if (c1 == c2) dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return m + n - 2 * dp[m][n];
    }
}
// @lc code=end

