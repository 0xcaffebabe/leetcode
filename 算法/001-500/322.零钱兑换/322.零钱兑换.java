import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 * 
 * 189/189 cases passed (12 ms)
 * Your runtime beats 69.91 % of java submissions
 * Your memory usage beats 95.71 % of java submissions (40.7 MB)
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

