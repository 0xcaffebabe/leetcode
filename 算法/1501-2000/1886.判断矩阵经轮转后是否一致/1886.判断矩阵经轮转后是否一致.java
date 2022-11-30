import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1886 lang=java
 *
 * [1886] 判断矩阵经轮转后是否一致
 * 
 * 113/113 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 11.4 % of java submissions (40.8 MB)
 */

// @lc code=start
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i < 4; i++) {
            rotate(mat);
            if (compare(mat, target)) return true;
        }
        return false;
    }

    private boolean compare(int[][] a, int[][] b) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }

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

