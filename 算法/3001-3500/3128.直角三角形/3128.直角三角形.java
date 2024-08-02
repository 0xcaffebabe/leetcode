/*
 * @lc app=leetcode.cn id=3128 lang=java
 * @lcpr version=
 *
 * [3128] 直角三角形
 * 
 * 637/637 cases passed (30 ms)
 * Your runtime beats 20.45 % of java submissions
 * Your memory usage beats 10.5 % of java submissions (143.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public long numberOfRightTriangles(int[][] grid) {
        int[] rows = new int[grid.length];
        int[] cols = new int[grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            int sum = 0;
            for(var cell: grid[i]) if (cell == 1) sum++;
            rows[i] = sum;
        }
        for(int i = 0; i < grid[0].length; i++) {
            int sum = 0;
            for(int j = 0; j < grid.length; j++) 
                if (grid[j][i] == 1) sum++;
            cols[i] = sum;
        }
        // System.out.println(Arrays.toString(rows));
        // System.out.println(Arrays.toString(cols));
        long ans = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) 
                if (grid[i][j] == 1) 
                    ans += (rows[i] - 1) * (cols[j] - 1);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,1,0],[0,1,1],[0,1,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,0,0,0],[0,1,0,1],[1,0,0,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,0,1],[1,0,0],[1,0,0]]\n
// @lcpr case=end

 */

