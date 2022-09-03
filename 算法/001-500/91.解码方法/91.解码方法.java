/*
 * @lc app=leetcode.cn id=91 lang=java
 *
 * [91] 解码方法
 * 
 * 269/269 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 60.62 % of java submissions (39.7 MB)
 */

// @lc code=start
class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++) {
            // 不为0的数记一次
            if (s.charAt(i - 1) != '0') dp[i] += dp[i-1];
            // 上一个不为0 并且当前这个与上面那个可以凑成26之内的数记一次
            if (i > 1 && s.charAt(i - 2) != '0' && (s.charAt(i - 2) - '0') * 10 + s.charAt(i - 1) - '0' <= 26) dp[i] += dp[i - 2];
        }
        return dp[n];
    }
}
// @lc code=end

