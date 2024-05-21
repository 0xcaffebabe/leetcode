/*
 * @lc app=leetcode.cn id=1277 lang=java
 * @lcpr version=
 *
 * [1277] 统计全为 1 的正方形子矩阵
 * 
 * 32/32 cases passed (6 ms)
 * Your runtime beats 75.56 % of java submissions
 * Your memory usage beats 11.33 % of java submissions (55 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countSquares(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int ans = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (i > 0 && j > 0 && mat[i][j] > 0)
                    mat[i][j] += Math.min(mat[i-1][j-1], Math.min(mat[i-1][j], mat[i][j-1]));
                ans += mat[i][j];
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,1,1,1],[1,1,1,1],[0,1,1,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,0,1],[1,1,0],[1,1,0]]\n
// @lcpr case=end

 */

