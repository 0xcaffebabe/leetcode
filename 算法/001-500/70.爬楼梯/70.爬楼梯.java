/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 * 
 * 45/45 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 48.41 % of java submissions (38.3 MB)
 */

// @lc code=start
class Solution {
    static int[] mem = new int[45];
    static {
        mem[0] = 1;
        mem[1] = 2;
        for(int i = 2; i < 45; i++) mem[i] = mem[i - 1] + mem[i - 2];
    }
    public int climbStairs(int n) {
        return mem[n - 1];
    }
}
// @lc code=end

