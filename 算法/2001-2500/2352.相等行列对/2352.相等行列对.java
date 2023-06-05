/*
 * @lc app=leetcode.cn id=2352 lang=java
 * @lcpr version=21908
 *
 * [2352] 相等行列对
 * 
 * 72/72 cases passed (8 ms)
 * Your runtime beats 96.52 % of java submissions
 * Your memory usage beats 29.06 % of java submissions (49.7 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int[][] cp = new int[n][n];
        for(int i = 0; i < n; i++) 
            for(int j = 0; j < n; j++) cp[i][j] = grid[j][i];
        
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) if (Arrays.equals(grid[i], cp[j])) ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[3,2,1],[1,7,6],[2,7,7]]\n
// [[1]]\n
// @lcpr case=end

// @lcpr case=start
// [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]\n
// @lcpr case=end

 */

