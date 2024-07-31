/*
 * @lc app=leetcode.cn id=3111 lang=java
 * @lcpr version=
 *
 * [3111] 覆盖所有点的最少矩形数目
 * 
 * 966/966 cases passed (5 ms)
 * Your runtime beats 59.1 % of java submissions
 * Your memory usage beats 25.06 % of java submissions (95.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        int start = points[0][0];
        int ans = 1;
        for(int i = 1; i < points.length; i++) {
            if (points[i][0] == start) continue;
            if (points[i][0] - start <= w) continue;
            start = points[i][0];
            ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[2,1],[1,0],[1,4],[1,8],[3,5],[4,6]]\n1\n
// @lcpr case=end

// @lcpr case=start
// [[0,0],[1,1],[2,2],[3,3],[4,4],[5,5],[6,6]]\n2\n
// @lcpr case=end

// @lcpr case=start
// [[2,3],[1,2]]\n0\n
// @lcpr case=end

 */

