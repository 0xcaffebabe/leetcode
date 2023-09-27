/*
 * @lc app=leetcode.cn id=2373 lang=java
 * @lcpr version=
 *
 * [2373] 矩阵中的局部最大值
 * 
 * 50/50 cases passed (3 ms)
 * Your runtime beats 34.91 % of java submissions
 * Your memory usage beats 96.7 % of java submissions (43.3 MB)
 */

// @lc code=start
class Solution {
    int[][] grid;
    public int[][] largestLocal(int[][] grid) {
        this.grid = grid;
        int n = grid.length;
        int m = n - 2;
        int[][] ans = new int[m][m];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                ans[i][j] = max(i + 1, j + 1);
            }
        }
        return ans;
    }

    int max(int r, int c) {
        int[] a = {
            grid[r - 1][c - 1],
            grid[r - 1][c],
            grid[r - 1][c + 1],
            grid[r][c - 1],
            grid[r][c],
            grid[r][c + 1],
            grid[r + 1][c - 1],
            grid[r + 1][c],
            grid[r + 1][c + 1]
        };
        int max = Integer.MIN_VALUE;
        for(var i : a) 
            if (i >= max) max = i;
        return max;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]\n
// [[1,1,1],[1,1,1],[1,1,2]]\n
// @lcpr case=end

 */

