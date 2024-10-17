/*
 * @lc app=leetcode.cn id=LCR 168 lang=java
 * @lcpr version=
 *
 * [LCR 168] 丑数
 * 
 * 596/596 cases passed (2 ms)
 * Your runtime beats 99.58 % of java submissions
 * Your memory usage beats 45.55 % of java submissions (40.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int p = 1;
        int q = 1;
        int k = 1;
        for(int i = 2; i <= n; i++) {
            int min = Math.min(dp[p] * 2, Math.min(dp[q] * 3, dp[k] * 5));
            dp[i] = min;
            if (dp[p] * 2 == min) p++;
            if (dp[q] * 3 == min) q++;
            if (dp[k] * 5 == min) k++;
        }

        return dp[n];
    }
}
// @lc code=end



/*
// @lcpr case=start
// 10\n
// 1\n
// 1690\n
// @lcpr case=end

 */

