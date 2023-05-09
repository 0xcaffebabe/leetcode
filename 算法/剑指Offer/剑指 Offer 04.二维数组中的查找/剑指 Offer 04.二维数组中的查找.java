/*
 * @lc app=leetcode.cn id=剑指 Offer 04 lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer 04] 二维数组中的查找
 * 
 * 129/129 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 99.31 % of java submissions (46.3 MB)
 */

// @lc code=start
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        if (n == 0) return false;

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

/*
// @lcpr case=start
// [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]\n
5\n
// @lcpr case=end

// @lcpr case=start
// []\n0\n
// @lcpr case=end

// @lcpr case=start
// [[]]\n0\n
// @lcpr case=end

 */

