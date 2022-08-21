import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=435 lang=java
 *
 * [435] 无重叠区间
 * 
 * 58/58 cases passed (49 ms)
 * Your runtime beats 60.88 % of java submissions
 * Your memory usage beats 92.48 % of java submissions (97.5 MB)
 */

// @lc code=start
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        if (n == 1) return 0;

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int right = intervals[0][1];
        int ans = 1;
        for(int i = 1; i < n; i++) {
            // 当前区间没法合并到上一个区间
            if (intervals[i][0] >= right) {
                ans++;
                right = intervals[i][1];
            }
        }
        return n - ans;
    }
}
// @lc code=end

