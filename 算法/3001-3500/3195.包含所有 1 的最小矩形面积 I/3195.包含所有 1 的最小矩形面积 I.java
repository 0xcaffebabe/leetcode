/*
 * @lc app=leetcode.cn id=3195 lang=java
 * @lcpr version=
 *
 * [3195] 包含所有 1 的最小矩形面积 I
 * 
 * 712/712 cases passed (6 ms)
 * Your runtime beats 86.2 % of java submissions
 * Your memory usage beats 47.32 % of java submissions (192.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minimumArea(int[][] grid) {
        int xMin = Integer.MAX_VALUE, yMin = Integer.MAX_VALUE;
        int xMax = 0, yMax = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    xMin = Math.min(xMin, i);
                    yMin = Math.min(yMin, j);
                    xMax = Math.max(xMax, i);
                    yMax = Math.max(yMax, j);
                }
            }
        }
        return (yMax - yMin + 1) * (xMax - xMin + 1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,1,0],[1,0,1]]\n
// [[0,1,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,0],[1,0]]\n
// @lcpr case=end

 */

