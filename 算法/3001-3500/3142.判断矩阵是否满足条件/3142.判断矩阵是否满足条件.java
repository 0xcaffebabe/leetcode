/*
 * @lc app=leetcode.cn id=3142 lang=java
 * @lcpr version=
 *
 * [3142] 判断矩阵是否满足条件
 * 
 * 882/882 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 69.1 % of java submissions (43.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if (i < grid.length - 1) {
                    if (grid[i][j] != grid[i + 1][j]) return false;
                }
                if (j < grid[i].length - 1) {
                    if (grid[i][j] == grid[i][j + 1]) return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,0,2],[1,0,2]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1,1],[0,0,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1],[2],[3]]\n
// @lcpr case=end

 */

