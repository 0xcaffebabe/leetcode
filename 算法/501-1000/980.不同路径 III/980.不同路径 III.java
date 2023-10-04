/*
 * @lc app=leetcode.cn id=980 lang=java
 * @lcpr version=
 *
 * [980] 不同路径 III
 * 
 * 39/39 cases passed (17 ms)
 * Your runtime beats 5.05 % of java submissions
 * Your memory usage beats 5.02 % of java submissions (43 MB)
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    int[][] dirs = {{1,0},{0,1},{-1,0},{0, -1}};
    int sx = 0, sy = 0;
    int ex = 0, ey = 0;
    int zeroCnt = 0;
    int[][] grid;
    int ans = 0;
    Set<String> visted = new HashSet<>();

    public int uniquePathsIII(int[][] grid) {
        this.grid = grid;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    sx = i;
                    sy = j;
                }
                if (grid[i][j] == 2) {
                    ex = i;
                    ey = j;
                }
                if (grid[i][j] == 0) zeroCnt++;
            }
        }
        visted.add(sx + "," + sy);
        bt(sx, sy, 0);
        return ans;
    }
    void bt(int x, int y, int cnt) {
        if (x < 0 || y < 0) return;
        if (x >= grid.length || y >= grid[0].length) return;
        if (grid[x][y] == -1) return;
        if (x == ex && y == ey) {
            if (cnt == zeroCnt + 1) ans++;
            return;
        }
        for(var dir: dirs) {
            int nx = x + dir[0];
            int ny = y + dir[1];
            if (visted.contains(nx + "," + ny)) continue;
            visted.add(nx + "," + ny);
            bt(nx, ny, cnt + 1);
            visted.remove(nx + "," + ny);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,0,0,0],[0,0,0,0],[0,0,2,-1]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,0,0,0],[0,0,0,0],[0,0,0,2]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,1],[2,0]]\n
// @lcpr case=end

 */

