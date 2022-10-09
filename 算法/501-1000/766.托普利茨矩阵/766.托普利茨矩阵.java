/*
 * @lc app=leetcode.cn id=766 lang=java
 *
 * [766] 托普利茨矩阵
 * 
 * 483/483 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 85.18 % of java submissions (41.2 MB)
 */

// @lc code=start
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m - 1; i++) {
            for(int j = 0; j < n - 1; j++) {
                if (matrix[i][j] != matrix[i+1][j+1]) return false;
            }
        }
        return true;
    }
}
// @lc code=end

