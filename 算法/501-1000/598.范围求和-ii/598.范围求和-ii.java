/*
 * @lc app=leetcode.cn id=598 lang=java
 *
 * [598] 范围求和 II
 * 
 * 69/69 cases passed (1 ms)
 * Your runtime beats 9.8 % of java submissions
 * Your memory usage beats 56.39 % of java submissions (41.4 MB)
 */

// @lc code=start
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int min = m * n;
        int[] mins = {m , n};
        for(var op: ops) {
            min = Math.min(op[0], mins[0]) * Math.min(op[1], mins[1]);
            mins = new int[]{Math.min(op[0], mins[0]) , Math.min(op[1], mins[1])};
        }
        return min;
    }
}
// @lc code=end

