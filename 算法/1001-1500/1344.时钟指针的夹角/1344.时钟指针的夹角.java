/*
 * @lc app=leetcode.cn id=1344 lang=java
 * @lcpr version=21907
 *
 * [1344] 时钟指针的夹角
 * 
 * 105/105 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 55.68 % of java submissions (38.4 MB)
 */

// @lc code=start
class Solution {
    public double angleClock(int hour, int minutes) {
        double h = 30 * (hour % 12) + 0.5 * minutes;
        double m = minutes * 6;
        return Math.min(Math.abs(h - m), 360 - Math.abs(h -m));
    }
}
// @lc code=end



/*
// @lcpr case=start
// 12\n30\n
// @lcpr case=end

// @lcpr case=start
// 4\n50\n
// @lcpr case=end

// @lcpr case=start
// 12\n0\n
// @lcpr case=end

 */

