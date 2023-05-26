/*
 * @lc app=leetcode.cn id=剑指 Offer II 095 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 095] 最长公共子序列
 * 
 * 44/44 cases passed (10 ms)
 * Your runtime beats 53.26 % of java submissions
 * Your memory usage beats 82.97 % of java submissions (43.8 MB)
 */

// @lc code=start
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcde"\n"ace"\n
// @lcpr case=end

// @lcpr case=start
// "abc"\n"abc"\n
// @lcpr case=end

// @lcpr case=start
// "abc"\n"def"\n
// @lcpr case=end

 */

