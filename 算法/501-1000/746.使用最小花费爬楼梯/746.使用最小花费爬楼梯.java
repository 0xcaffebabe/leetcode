import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=746 lang=java
 *
 * [746] 使用最小花费爬楼梯
 * 
 * 283/283 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 74.26 % of java submissions (40.9 MB)
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        for(int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}
// @lc code=end

