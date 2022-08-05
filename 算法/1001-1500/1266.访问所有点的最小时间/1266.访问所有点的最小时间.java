/*
 * @lc app=leetcode.cn id=1266 lang=java
 *
 * [1266] 访问所有点的最小时间
 * 
 * 122/122 cases passed (1 ms)
 * Your runtime beats 91.67 % of java submissions
 * Your memory usage beats 98.15 % of java submissions (40.5 MB)
 */

// @lc code=start
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int dx = 0;
        int dy = 0;
        int ans = 0;
        for(int i = 1; i < points.length; i++) {
            dx = Math.abs(points[i-1][0] - points[i][0]);
            dy = Math.abs(points[i-1][1] - points[i][1]);
            if (dx == dy) ans += dx;
            else if (dx < dy) ans += dx + (dy - dx);
            else if (dy < dx) ans += dy + (dx - dy);
        }
        return ans;
    }
}
// @lc code=end

