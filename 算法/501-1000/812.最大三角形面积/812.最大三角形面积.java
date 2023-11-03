/*
 * @lc app=leetcode.cn id=812 lang=java
 * @lcpr version=
 *
 * [812] 最大三角形面积
 * 
 * 57/57 cases passed (6 ms)
 * Your runtime beats 51.54 % of java submissions
 * Your memory usage beats 12.78 % of java submissions (39.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double ans = 0;
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    int x0 = points[k][0];
                    int y0 = points[k][1];
                    int x1 = points[i][0];
                    int y1 = points[i][1];
                    int x2 = points[j][0];
                    int y2 = points[j][1];
                    double area = 0.5 * Math.abs(x1 * (y2 - y0) + x2 * (y0 - y1) + x0 * (y1 - y2));
                    ans = Math.max(ans, area);
                }
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,0],[0,1],[1,0],[0,2],[2,0]]\n
// [[35,-23],[-12,-48],[-34,-40],[21,-25],[-35,-44],[24,1],[16,-9],[41,4],[-36,-49],[42,-49],[-37,-20],[-35,11],[-2,-36],[18,21],[18,8],[-24,14],[-23,-11],[-8,44],[-19,-3],[0,-10],[-21,-4],[23,18],[20,11],[-42,24],[6,-19]]
// @lcpr case=end

// @lcpr case=start
// [[1,0],[0,0],[0,1]]\n
// @lcpr case=end

 */

