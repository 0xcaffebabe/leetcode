/*
 * @lc app=leetcode.cn id=剑指 Offer II 105 lang=java
 * @lcpr version=21910
 *
 * [剑指 Offer II 105] 岛屿的最大面积
 * 
 * 728/728 cases passed (2 ms)
 * Your runtime beats 67.38 % of java submissions
 * Your memory usage beats 65.42 % of java submissions (41.9 MB)
 */

// @lc code=start
class Solution {
    int m;
    int n;
    int[][] grid;
    boolean[][] vis;
    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        vis = new boolean[m][n];
        this.grid = grid;
        int ans = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) ans = Math.max(ans, dfs(i, j));
        }
        return ans;
    }

    int dfs(int r, int c) {
        if (r < 0 || c < 0 || r >= m || c >= n) return 0;
        if (grid[r][c] == 0 || vis[r][c]) return 0;
        int ret = 1;
        vis[r][c] = true;
        ret += dfs(r + 1, c);
        ret += dfs(r - 1, c);
        ret += dfs(r, c + 1);
        ret += dfs(r, c - 1);
        return ret;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,0,0,0,0,0,0,0]]\n
// @lcpr case=end

 */

