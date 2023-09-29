/*
 * @lc app=leetcode.cn id=1641 lang=java
 * @lcpr version=
 *
 * [1641] 统计字典序元音字符串的数目
 * 
 * 41/41 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 73.42 % of java submissions (38 MB)
 */

// @lc code=start
class Solution {
    public int countVowelStrings(int n) {
        int[][] dp = new int[n + 1][5];
        for(int i = 0; i < 5; i++)
            dp[1][i] = 1;
        for(int i = 2; i <= n; i++) {
            for(int j = 0; j < 5; j++) {
                for(int k = 0; k <= j; k++) {
                    dp[i][j] += dp[i - 1][k];
                }
            }
        }
        return dp[n][0] + dp[n][1] + dp[n][2] + dp[n][3] + dp[n][4];
    }
}
// @lc code=end



/*
// @lcpr case=start
// 1\n
// @lcpr case=end

// @lcpr case=start
// 2\n
// @lcpr case=end

// @lcpr case=start
// 33\n
// 50\n
// 1\n
// @lcpr case=end

 */

