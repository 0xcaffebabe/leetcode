/*
 * @lc app=leetcode.cn id=剑指 Offer II 088 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 088] 爬楼梯的最少成本
 * 
 * 283/283 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 13.22 % of java submissions (41.9 MB)
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



/*
// @lcpr case=start
// [10, 15, 20]\n
// @lcpr case=end

// @lcpr case=start
// [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]\n
// @lcpr case=end

 */

