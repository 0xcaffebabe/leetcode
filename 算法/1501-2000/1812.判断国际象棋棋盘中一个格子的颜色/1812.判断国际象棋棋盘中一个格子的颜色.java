/*
 * @lc app=leetcode.cn id=1812 lang=java
 *
 * [1812] 判断国际象棋棋盘中一个格子的颜色
 * 
 * 64/64 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 43.9 % of java submissions (39.5 MB)
 */

// @lc code=start
class Solution {
    public boolean squareIsWhite(String coordinates) {
        int c = coordinates.charAt(0) - 'a';
        int r = coordinates.charAt(1) - '0';

        if (r % 2 == 0) return c % 2 == 0;
        else return c % 2 == 1;
    }
}
// @lc code=end

