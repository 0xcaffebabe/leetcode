/*
 * @lc app=leetcode.cn id=1351 lang=java
 *
 * [1351] 统计有序矩阵中的负数
 * 
 * 44/44 cases passed (1 ms)
 * Your runtime beats 29.53 % of java submissions
 * Your memory usage beats 63.57 % of java submissions (41.8 MB)
 */

// @lc code=start
class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) if (grid[i][j] < 0) ans++;
        }
        return ans;
    }
}
// @lc code=end

