/*
 * @lc app=leetcode.cn id=2428 lang=java
 * @lcpr version=
 *
 * [2428] 沙漏的最大总和
 * 
 * 41/41 cases passed (5 ms)
 * Your runtime beats 46.58 % of java submissions
 * Your memory usage beats 82.19 % of java submissions (43.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        for (int i = 0; i < m - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2] 
                        + grid[i + 1][j + 1]
                        + grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[6,2,1,3],[4,2,1,5],[9,2,8,7],[4,1,2,9]]\n
// [[6,2,1,3],[4,2,1,5],[9,2,8,7]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,2,3],[4,5,6],[7,8,9]]\n
// @lcpr case=end

 */

