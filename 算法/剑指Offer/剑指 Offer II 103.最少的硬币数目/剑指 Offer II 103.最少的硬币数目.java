/*
 * @lc app=leetcode.cn id=剑指 Offer II 103 lang=java
 * @lcpr version=21910
 *
 * [剑指 Offer II 103] 最少的硬币数目
 * 
 * 188/188 cases passed (12 ms)
 * Your runtime beats 86 % of java submissions
 * Your memory usage beats 39.55 % of java submissions (42 MB)
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount +1);
        dp[0]=0;
        for(int i =1; i<= amount; i++) {
            for(int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    // 当前金额所需硬币 = (当前金额 - 硬币的金额)所需的硬币 + 1
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] +1);
                }
            }
        }
        return dp[amount] > amount ? -1: dp[amount];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1, 2, 5]\n11\n
// @lcpr case=end

// @lcpr case=start
// [2]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1]\n0\n
// @lcpr case=end

// @lcpr case=start
// [1]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1]\n2\n
// @lcpr case=end

 */

