/*
 * @lc app=leetcode.cn id=1523 lang=java
 *
 * [1523] 在区间范围内统计奇数数目
 * 
 * 84/84 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 43.32 % of java submissions (38.4 MB)
 */

// @lc code=start
class Solution {
    public int countOdds(int low, int high) {
        int delta = high - low;
        int ans = delta / 2;
        if (low % 2 != 0) ans++;
        else if (high % 2 != 0) ans++;
        return ans;
    }
}
// @lc code=end

