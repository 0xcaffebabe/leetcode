/*
 * @lc app=leetcode.cn id=剑指 Offer 10- I lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer 10- I] 斐波那契数列
 * 
 * 51/51 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 56.63 % of java submissions (38.2 MB)
 */

// @lc code=start
class Solution {
    static int[] dp = new int[103];
    static {
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= 100; i++) {
            dp[i] = (dp[i-1]+dp[i-2]) % 1000000007;
        }
    }
    public int fib(int n) {
        return dp[n];
    }
}
// @lc code=end



/*

// @lcpr case=start
// 1\n
// @lcpr case=end

// @lcpr case=start
// 0\n
// @lcpr case=end

// @lcpr case=start
// 2\n
// @lcpr case=end

// @lcpr case=start
// 5\n
// @lcpr case=end

// @lcpr case=start
// 100\n
// @lcpr case=end

 */

