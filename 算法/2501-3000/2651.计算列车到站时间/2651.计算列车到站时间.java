/*
 * @lc app=leetcode.cn id=2651 lang=java
 * @lcpr version=
 *
 * [2651] 计算列车到站时间
 * 
 * 556/556 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 60.87 % of java submissions (38.4 MB)
 */

// @lc code=start
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 15\n5\n
// @lcpr case=end

// @lcpr case=start
// 13\n11\n
// 23\n24\n
// 1\n24\n
// 13\n12\n
// @lcpr case=end

 */

