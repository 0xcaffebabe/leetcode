/*
 * @lc app=leetcode.cn id=73 lang=java
 *
 * [73] 矩阵置零
 * 
 * 164/164 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 5.2 % of java submissions (43.6 MB)
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (rows[i] || cols[j]) matrix[i][j] = 0;
            }
        }
    }
}
// @lc code=end

