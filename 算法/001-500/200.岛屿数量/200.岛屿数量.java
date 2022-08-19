/*
 * @lc app=leetcode.cn id=200 lang=java
 *
 * [200] 岛屿数量
 * 
 * 49/49 cases passed (2 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 33.69 % of java submissions (49.9 MB)
 */

// @lc code=start
class Solution {
    char[][] grid;
    int m;
    int n;
    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        this.grid = grid;
        int ans = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j);
                    ans++;
                }
            }
        }
        return ans;
    }
    void dfs(int i, int j) {
        grid[i][j] = '0';
        if (i > 0 && grid[i-1][j] == '1') dfs(i-1, j);
        if (i < m - 1 && grid[i+1][j] == '1') dfs(i+1, j);
        if (j > 0 && grid[i][j-1] == '1') dfs(i, j-1);
        if (j < n - 1 && grid[i][j+1] == '1') dfs(i, j+1);

    }
}
// @lc code=end

