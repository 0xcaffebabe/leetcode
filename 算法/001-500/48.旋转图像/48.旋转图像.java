/*
 * @lc app=leetcode.cn id=48 lang=java
 *
 * [48] 旋转图像
 * 
 * 21/21 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 12.93 % of java submissions (40.6 MB)
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] copy = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) copy[i][j] = matrix[i][j];
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) matrix[j][n - i - 1] = copy[i][j];
        }
    }
}
// @lc code=end

