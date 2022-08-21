/*
 * @lc app=leetcode.cn id=463 lang=java
 *
 * [463] 岛屿的周长
 * 
 * 5833/5833 cases passed (5 ms)
 * Your runtime beats 76.58 % of java submissions
 * Your memory usage beats 85.89 % of java submissions (42 MB)
 */

// @lc code=start
class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (grid[i][j] == 0) continue;
                if (i == 0) ans++;
                if (j == 0) ans++;
                if (i == n - 1) ans++;
                if (j == m - 1) ans++;
                if (i > 0 && grid[i - 1][j] == 0) ans++;
                if (j > 0 && grid[i][j - 1] == 0) ans++;
                if (i < n - 1 && grid[i + 1][j] == 0) ans++;
                if (j < m - 1 && grid[i][j + 1] == 0) ans++;
            }
        }
        return ans;
    }
}
// @lc code=end

