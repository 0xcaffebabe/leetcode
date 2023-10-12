/*
 * @lc app=leetcode.cn id=2319 lang=java
 * @lcpr version=
 *
 * [2319] 判断矩阵是否是一个 X 矩阵
 * 
 * 84/84 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 89.1 % of java submissions (42.5 MB)
 */

// @lc code=start
class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for(int i = 0; i < n; i++) {
            if (grid[i][i] == 0 || grid[i][n-i-1] == 0) return false;
            grid[i][i] = -1;
            grid[i][n-i-1] = -1;
        }
        for(var i : grid)
            for(var j: i) if (j != 0 && j != -1) return false;
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[2,0,0,1],[0,3,1,0],[0,5,2,0],[4,0,0,2]]\n
// @lcpr case=end

// @lcpr case=start
// [[5,7,0],[0,3,1],[0,5,0]]\n
// [[5,0,7],[0,3,0],[5,0,5]]\n
// @lcpr case=end

 */

