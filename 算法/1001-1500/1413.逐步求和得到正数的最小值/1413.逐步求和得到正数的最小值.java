/*
 * @lc app=leetcode.cn id=1413 lang=java
 *
 * [1413] 逐步求和得到正数的最小值
 * 
 * 55/55 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 37.53 % of java submissions (39 MB)
 */

// @lc code=start
class Solution {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(var i : nums) {
            sum += i;
            if (sum < min) min = sum;
        }
        if (min < 0) return Math.abs(min) + 1;
        return 1;
    }
}
// @lc code=end

