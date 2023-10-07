/*
 * @lc app=leetcode.cn id=LCR 091 lang=java
 * @lcpr version=
 *
 * [LCR 091] 粉刷房子
 * 
 * 100/100 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 77.01 % of java submissions (40.6 MB)
 */

// @lc code=start
class Solution {
    public int minCost(int[][] costs) {
        for(int i = 1; i < costs.length; i++) {
            costs[i][0] += Math.min(costs[i-1][1], costs[i-1][2]);
            costs[i][1] += Math.min(costs[i-1][0], costs[i-1][2]);
            costs[i][2] += Math.min(costs[i-1][0], costs[i-1][1]);
        }
        var a = costs[costs.length - 1][0];
        var b = costs[costs.length - 1][1];
        var c = costs[costs.length - 1][2];
        return Math.min(Math.min(a,b),c);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[17,2,17],[16,16,5],[14,3,19]]\n
// @lcpr case=end

// @lcpr case=start
// [[7,6,2]]\n
// @lcpr case=end

 */

