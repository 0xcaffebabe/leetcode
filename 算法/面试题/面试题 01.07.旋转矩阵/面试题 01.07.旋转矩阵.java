/*
 * @lc app=leetcode.cn id=面试题 01.07 lang=java
 * @lcpr version=
 *
 * [面试题 01.07] 旋转矩阵
 * 
 * 21/21 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 71.61 % of java submissions (41.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
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

/*
// @lcpr case=start
// [[1,2,3],[4,5,6],[7,8,9]]
// @lcpr case=end


 */

