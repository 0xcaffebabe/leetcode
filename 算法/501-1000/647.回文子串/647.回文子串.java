/*
 * @lc app=leetcode.cn id=647 lang=java
 *
 * [647] 回文子串
 * 
 * 130/130 cases passed (18 ms)
 * Your runtime beats 10.29 % of java submissions
 * Your memory usage beats 9.09 % of java submissions (42 MB)
 */

// @lc code=start
class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        var dp = new boolean[n][n];
        int ans = 0;
        for(int i = 0; i < n; i++) dp[i][i] = true;

        for(int j = 0; j < n; j++) {
            for(int i = 0; i < n; i++) {
                boolean eq = s.charAt(i) == s.charAt(j);
                dp[i][j] = eq && (j - i < 2 || dp[i+1][j-1]);
                if (i <= j && dp[i][j]) ans++;
            }
        }
        // print(dp);
        return ans;
    }

    void print(boolean[][] dp) {
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp.length; j++) {
                System.out.println(i + "|" + j); 
            }
        }
    }
}
// @lc code=end

