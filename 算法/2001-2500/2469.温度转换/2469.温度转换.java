/*
 * @lc app=leetcode.cn id=2469 lang=java
 * @lcpr version=
 *
 * [2469] 温度转换
 * 
 * 74/74 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 19.65 % of java submissions (39.9 MB)
 */

// @lc code=start
class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[]{
            celsius + 273.15,
            celsius * 1.8 + 32
        };
    }
}
// @lc code=end



/*
// @lcpr case=start
// 36.50\n
// 0\n
// @lcpr case=end

// @lcpr case=start
// 122.11\n
// @lcpr case=end

 */

