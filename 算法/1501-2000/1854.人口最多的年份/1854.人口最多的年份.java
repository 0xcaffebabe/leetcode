/*
 * @lc app=leetcode.cn id=1854 lang=java
 *
 * [1854] 人口最多的年份
 * 
 * 52/52 cases passed (1 ms)
 * Your runtime beats 48.39 % of java submissions
 * Your memory usage beats 29.35 % of java submissions (39.8 MB)
 */

// @lc code=start
class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[100];
        for(var log: logs) {
            for(int i = log[0]; i < log[1]; i++) years[i - 1950]++;
        }
        int max = Integer.MIN_VALUE;
        int maxYear = 1950;
        for(int i = 0; i < years.length; i++) {
            if (years[i] > max) {
                max = years[i];
                maxYear = 1950 + i;
            }
        }
        return maxYear;
    }
}
// @lc code=end

