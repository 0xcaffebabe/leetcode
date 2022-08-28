/*
 * @lc app=leetcode.cn id=1518 lang=java
 *
 * [1518] 换酒问题
 * 
 * 64/64 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 19.15 % of java submissions (38.5 MB)
 */

// @lc code=start
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0;
        while(numBottles >= numExchange) {
            ans += numExchange;
            numBottles -= numExchange - 1;
        }
        ans += numBottles;
        return ans;
    }
}
// @lc code=end

