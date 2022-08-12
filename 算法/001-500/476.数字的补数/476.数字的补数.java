/*
 * @lc app=leetcode.cn id=476 lang=java
 *
 * [476] 数字的补数
 * 
 * 149/149 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 66.48 % of java submissions (38.3 MB)
 */

// @lc code=start
class Solution {
    public int findComplement(int num) {
        int n = num;
        int mask = 0;
        while(n > 0) {
            mask = mask * 2 + 1;
            n /= 2;
        }
        return mask ^ num;
    }
}
// @lc code=end

