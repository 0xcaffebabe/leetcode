/*
 * @lc app=leetcode.cn id=1779 lang=java
 *
 * [1779] 找到最近的有相同 X 或 Y 坐标的点
 * 
 * 101/101 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 96.16 % of java submissions (48.5 MB)
 */

// @lc code=start
class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int d = Integer.MAX_VALUE;
        int ans = -1;
        for(int i = 0; i < points.length; i++) {
            var p = points[i];
            if (p[0] == x || p[1] == y) {
                int dd = Math.abs(x - p[0]) + Math.abs(y - p[1]);
                if (dd < d) {
                    d = dd;
                    ans = i;
                }
            }
        }
        return ans;
    }
}
// @lc code=end

