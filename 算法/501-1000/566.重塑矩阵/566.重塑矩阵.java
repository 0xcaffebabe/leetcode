/*
 * @lc app=leetcode.cn id=566 lang=java
 *
 * [566] 重塑矩阵
 * 
 * 57/57 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 43.55 % of java submissions (42.4 MB)
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) return mat;
        
        int[][] ans = new int[r][c];
        int x = 0;
        int y = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                ans[i][j] = mat[y][x];
                if (x == n - 1) {
                    x = 0;
                    y++;
                }else {
                    x++;
                }
            }
        }
        return ans;

    }
}
// @lc code=end

