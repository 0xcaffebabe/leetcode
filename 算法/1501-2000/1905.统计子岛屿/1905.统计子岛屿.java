/*
 * @lc app=leetcode.cn id=1905 lang=java
 * @lcpr version=
 *
 * [1905] 统计子岛屿
 * 
 * 57/57 cases passed (43 ms)
 * Your runtime beats 9.52 % of java submissions
 * Your memory usage beats 50.73 % of java submissions (76.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    boolean[][] visted;
    int[][] grid2;
    int m;
    int n;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        m = grid1.length;
        n = grid1[0].length;
        visted = new boolean[m][n];
        this.grid2 = grid2;
        int ans = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                List<int[]> list = new ArrayList<>();
                dfs(i, j, list);
                if (list.size() == 0) continue;
                boolean allMatch = true;
                for(var c: list) {
                    allMatch &= grid1[c[0]][c[1]] == 1;
                }
                if (allMatch) ans++;
            }
        }
        return ans;
    }

    void dfs(int x, int y, List<int[]> coords) {
        if (x < 0 || y < 0) return;
        if (x >= m || y >= n) return;
        if (visted[x][y]) return;
        if (grid2[x][y] == 0) return;
        coords.add(new int[]{x, y});
        visted[x][y] = true;
        dfs(x, y - 1, coords);
        dfs(x, y + 1, coords);
        dfs(x + 1, y, coords);
        dfs(x - 1, y, coords);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,1,1,0,0],[0,1,1,1,1],[0,0,0,0,0],[1,0,0,0,0],[1,1,0,1,1]]\n[[1,1,1,0,0],[0,0,1,1,1],[0,1,0,0,0],[1,0,1,1,0],[0,1,0,1,0]]\n
// [[1,1,1,0,0],[0,1,1,1,1],[0,0,0,0,0],[1,0,0,0,0],[1,1,0,1,1]]\n[[1,1,1,0,0],[0,1,1,1,1],[0,1,0,0,0],[1,0,1,1,0],[0,1,0,1,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,0,1,0,1],[1,1,1,1,1],[0,0,0,0,0],[1,1,1,1,1],[1,0,1,0,1]]\n[[0,0,0,0,0],[1,1,1,1,1],[0,1,0,1,0],[0,1,0,1,0],[1,0,0,0,1]]\n
// @lcpr case=end

 */

