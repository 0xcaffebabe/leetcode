/*
 * @lc app=leetcode.cn id=3100 lang=java
 * @lcpr version=
 *
 * [3100] 换水问题 II
 * 
 * 958/958 cases passed (1 ms)
 * Your runtime beats 3.07 % of java submissions
 * Your memory usage beats 49.08 % of java submissions (39.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = 0;
        while(numBottles >= numExchange) {
            numBottles -= numExchange - 1;
            ans += numExchange;
            numExchange++;
        }
        return ans + numBottles;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 13\n6\n
// 100\n100\n
// @lcpr case=end

// @lcpr case=start
// 10\n3\n
// @lcpr case=end

 */

