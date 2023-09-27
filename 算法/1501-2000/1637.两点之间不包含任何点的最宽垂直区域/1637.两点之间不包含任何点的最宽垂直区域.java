/*
 * @lc app=leetcode.cn id=1637 lang=java
 * @lcpr version=
 *
 * [1637] 两点之间不包含任何点的最宽垂直区域
 * 
 * 55/55 cases passed (47 ms)
 * Your runtime beats 20.79 % of java submissions
 * Your memory usage beats 86.14 % of java submissions (66.3 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a,b) -> a[0] - b[0]);
        int max = 0;
        for(int i = 1; i < points.length; i++) 
            max = Math.max(max, points[i][0] - points[i - 1][0]);
        
        return max;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[8,7],[9,9],[7,4],[9,7]]\n
// @lcpr case=end

// @lcpr case=start
// [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]\n
// [[3,1],[9,0]]\n
// [[0,0],[0,0]]\n
// @lcpr case=end

 */

