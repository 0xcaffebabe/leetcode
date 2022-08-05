/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 * 
 * 140/140 cases passed (353 ms)
 * Your runtime beats 9.41 % of java submissions
 * Your memory usage beats 42.47 % of java submissions (43.9 MB)
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        // dp[i][j] 代表字符串位置i 到位置j是否为回文串
        // dp[i][j] = d[i+1][j-1] && s[i] == s[j]
        boolean[][] dp = new boolean[n][n];
        
        // 长度为1的都是回文串
        for(int i = 0; i < n; i++) dp[i][i] = true;
        int max = 0;
        int ansL = 0;
        int ansR = 0;
        // 先求解小字符串的解 
        // 再根据小字符串的解求得大字符串的解
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < n - 1; i++) {
                boolean eq = s.charAt(i) == s.charAt(j);
                if (j - i < 2) dp[i][j] = eq;
                else dp[i][j] = dp[i+1][j-1] && eq;
                
                if (dp[i][j] && j - i > max) {
                    max = j - i;
                    ansL = i;
                    ansR = j;
                }
            }
        }
        // print(dp);
        return s.substring(ansL, ansR + 1);
    }

    void print(boolean[][] dp) {
        for(var i : dp) {
            for(var j : i) System.out.print(j + " ");
            System.out.println();
        }
    }
}
// @lc code=end

