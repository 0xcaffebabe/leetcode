/*
 * @lc app=leetcode.cn id=441 lang=java
 *
 * [441] 排列硬币
 * 
 * 1335/1335 cases passed (1 ms)
 * Your runtime beats 96.29 % of java submissions
 * Your memory usage beats 8.1 % of java submissions (39.2 MB)
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        int left = 1, right = n;
        while(left < right) {
            int mid = (right - left + 1) / 2 + left;
            if ((long)mid * (mid + 1) <= (long)2 * n) left = mid;
            else right = mid - 1;
        }
        return left;
    }
}
// @lc code=end

