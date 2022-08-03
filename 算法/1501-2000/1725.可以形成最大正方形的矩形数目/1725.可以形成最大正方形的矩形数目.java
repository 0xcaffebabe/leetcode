/*
 * @lc app=leetcode.cn id=1725 lang=java
 *
 * [1725] 可以形成最大正方形的矩形数目
 * 
 * 68/68 cases passed (2 ms)
 * Your runtime beats 68.49 % of java submissions
 * Your memory usage beats 93.97 % of java submissions (41.3 MB)
 */

// @lc code=start
class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        int ans = 0;
        for(var i : rectangles) {
            int c = Math.min(i[0], i[1]);
            if (c > maxLen) maxLen = c;
        }
        for(var i : rectangles) {
            int c = Math.min(i[0], i[1]);
            if (c == maxLen) ans++;
        }
        return ans;
    }
}
// @lc code=end

