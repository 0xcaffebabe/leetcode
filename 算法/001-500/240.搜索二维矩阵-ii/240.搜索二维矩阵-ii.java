/*
 * @lc app=leetcode.cn id=240 lang=java
 *
 * [240] 搜索二维矩阵 II
 * 
 * 129/129 cases passed (5 ms)
 * Your runtime beats 93.75 % of java submissions
 * Your memory usage beats 55.42 % of java submissions (47.3 MB)
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int x = 0;
        int y = n - 1;
        // 从右上角找
        while(y >= 0 && x < m) {
            if (matrix[x][y] == target) return true;
            // 目标值位于左方
            if (target < matrix[x][y]) y--;
            // 目标值位于下方
            else x++;
        }
        return false;
    }
}
// @lc code=end

