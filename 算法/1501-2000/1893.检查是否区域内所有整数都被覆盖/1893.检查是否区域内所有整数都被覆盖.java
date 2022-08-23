/*
 * @lc app=leetcode.cn id=1893 lang=java
 *
 * [1893] 检查是否区域内所有整数都被覆盖
 * 
 * 105/105 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 90.22 % of java submissions (39.4 MB)
 */

// @lc code=start
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int success = 0;
        for(int i = left; i <= right; i++) {
            for(var range: ranges) {
                if (range[0] <= i && range[1] >= i) {
                    success++;
                    break;
                }
            }
        }
        return success == right - left + 1;
    }
}
// @lc code=end

