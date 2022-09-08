/*
 * @lc app=leetcode.cn id=201 lang=java
 *
 * [201] 数字范围按位与
 * 
 * 8268/8268 cases passed (3 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 96.59 % of java submissions (40.4 MB)
 */

// @lc code=start
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while(left != right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        return left <<= shift;
    }
}
// @lc code=end

