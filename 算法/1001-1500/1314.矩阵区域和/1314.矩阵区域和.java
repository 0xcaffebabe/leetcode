/*
 * @lc app=leetcode.cn id=1314 lang=java
 * @lcpr version=
 *
 * [1314] 矩阵区域和
 * 
 * 12/12 cases passed (1649 ms)
 * Your runtime beats 5.11 % of java submissions
 * Your memory usage beats 70.21 % of java submissions (43.5 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    int[][] mat;
    public int[][] matrixBlockSum(int[][] mat, int k) {
        this.mat = mat;
        int[][] ans = new int[mat.length][mat[0].length];
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                for(int ii = i - k; ii <= i + k; ii++) {
                    for(int jj = j - k; jj <= j + k; jj++) {
                        ans[i][j] += sum(ii, jj);
                    }
                }
            }
        }
        return ans;
    }
    int sum(int i, int j) {
        if (i < 0 || j < 0) return 0;
        if (i >= mat.length || j >= mat[i].length) return 0;
        return mat[i][j];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2,3],[4,5,6],[7,8,9]]\n1\n
// @lcpr case=end

// @lcpr case=start
// [[1,2,3],[4,5,6],[7,8,9]]\n2\n
// [[1,2,3],[4,5,6],[7,8,9]]\n3\n
// [[1]]\n1
// @lcpr case=end

 */

