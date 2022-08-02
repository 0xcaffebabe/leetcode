/*
 * @lc app=leetcode.cn id=1828 lang=java
 *
 * [1828] 统计一个圆中点的数目
 * 
 * 66/66 cases passed (49 ms)
 * Your runtime beats 18.23 % of java submissions
 * Your memory usage beats 47.85 % of java submissions (42 MB)
 */

// @lc code=start
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        int pos = 0;
        for(int i = 0; i < queries.length; i++) {
            var qr = queries[i];
            int x2 = qr[0];
            int y2 = qr[1];
            int r = qr[2];
            for(var po: points) {
                int x1 = po[0];
                int y1 = po[1];
                var dis = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
                if (dis <= r) ans[i]++;
            }
        }
        return ans;
    }
}
// @lc code=end

