/*
 * @lc app=leetcode.cn id=807 lang=java
 *
 * [807] 保持城市天际线
 * 
 * 133/133 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 87.22 % of java submissions (40.8 MB)
 */

// @lc code=start
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] rowMax = new int[n];
        int[] columnMax = new int[n];
        for(int i = 0; i < n; i++) {
            int rmax = Integer.MIN_VALUE;
            int cmax = Integer.MIN_VALUE;
            for(int j = 0; j < n; j++) {
                if (grid[i][j] > rmax) rmax = grid[i][j];
                if (grid[j][i] > cmax) cmax = grid[j][i];
            }
            rowMax[i] = rmax;
            columnMax[i] = cmax;
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int cur = grid[i][j];
                ans += Math.max(0, Math.min(rowMax[i], columnMax[j]) - cur);
            }
        }
        return ans;
    }
}
// @lc code=end

