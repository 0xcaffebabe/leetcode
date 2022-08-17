/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 * 
 * 133/133 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 77.22 % of java submissions (40.9 MB)
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(var i : matrix) {
            if (target >= i[0] && target <= i[i.length - 1]) {
                for(var j : i) if (j == target) return true;
            }else {
                continue;
            }
        }
        return false;
    }
}
// @lc code=end

