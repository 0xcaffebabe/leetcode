/*
 * @lc app=leetcode.cn id=2220 lang=java
 *
 * [2220] 转换数字的最少位翻转次数
 * 
 * 250/250 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 57.65 % of java submissions (38.4 MB)
 */

// @lc code=start
class Solution {
    public int minBitFlips(int start, int goal) {
        int n = start ^ goal;
        int ans = 0;
        while(n != 0) {
            ans += n %2;
            n /= 2;
        }
        return ans;
    }
}
// @lc code=end

