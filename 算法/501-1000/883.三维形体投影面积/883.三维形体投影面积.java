/*
 * @lc app=leetcode.cn id=883 lang=java
 * @lcpr version=
 *
 * [883] 三维形体投影面积
 * 
 * 90/90 cases passed (2 ms)
 * Your runtime beats 81.16 % of java submissions
 * Your memory usage beats 85.02 % of java submissions (41.8 MB)
 */

// @lc code=start
class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int a = 0;
        int b = 0;
        int c = 0;
        for(var i : grid)
            for(var j : i) if (j != 0) a++;
        for(int i = 0; i < n; i++) {
            int maxB = 0;
            int maxC = 0;
            for(int j = 0; j < n; j++) {
                maxB = Math.max(grid[j][i], maxB);
                maxC = Math.max(grid[i][j], maxC);
            }
            b += maxB;
            c += maxC;
        }
        return a + b + c;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2],[3,4]]\n
// @lcpr case=end

// @lcpr case=start
// [[2]]\n
// [[2,1,4],[4,5,6],[7,8,9]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,0],[0,2]]\n
// @lcpr case=end

 */

