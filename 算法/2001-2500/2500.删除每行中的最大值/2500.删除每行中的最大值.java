/*
 * @lc app=leetcode.cn id=2500 lang=java
 * @lcpr version=21907
 *
 * [2500] 删除每行中的最大值
 * 
 * 55/55 cases passed (3 ms)
 * Your runtime beats 74.83 % of java submissions
 * Your memory usage beats 10.3 % of java submissions (41.9 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(var i : grid)  Arrays.sort(i);
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        for(int j = 0; j < m; j++) {
            int max = -1;
            for(int i = 0; i < n; i++) max = Math.max(max, grid[i][j]);
            ans += max;
            // System.out.println(max);
        }

        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2,4],[3,3,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[10]]\n
// @lcpr case=end

 */

