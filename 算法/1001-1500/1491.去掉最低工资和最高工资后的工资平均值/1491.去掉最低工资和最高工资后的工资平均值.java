import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1491 lang=java
 *
 * [1491] 去掉最低工资和最高工资后的工资平均值
 * 
 * 43/43 cases passed (1 ms)
 * Your runtime beats 14.24 % of java submissions
 * Your memory usage beats 52.18 % of java submissions (39.1 MB)
 */

// @lc code=start
class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        return (Arrays.stream(salary).sum() - salary[0] - salary[salary.length - 1])
            / (salary.length - 2d);
    }
}
// @lc code=end

