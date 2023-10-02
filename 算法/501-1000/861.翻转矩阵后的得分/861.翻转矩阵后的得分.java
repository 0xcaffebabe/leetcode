/*
 * @lc app=leetcode.cn id=861 lang=java
 * @lcpr version=
 *
 * [861] 翻转矩阵后的得分
 * 
 * 80/80 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 30.88 % of java submissions (39.3 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int matrixScore(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            if (grid[i][0] != 0) continue;
            for(int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) grid[i][j] = 0;
                else grid[i][j] = 1;
            }
        }
        for(int j = 0; j < grid[0].length; j++) {
            int cnt = 0;
            for(int i = 0; i < grid.length; i++) 
                if (grid[i][j] == 0) cnt++;
            if (cnt <= grid.length / 2) continue;
            for(int i = 0; i < grid.length; i++) {
                if (grid[i][j] == 1) grid[i][j] = 0;
                else grid[i][j] = 1;
            }
        }
        // for(var i : grid) System.out.println(Arrays.toString(i));
        int ans = 0;
        for(var i : grid) ans += tob(i);
        return ans;
    }

    int tob(int[] a) {
        int ret = 0;
        for(int i = a.length - 1; i >= 0; i--) 
            ret += a[i] * Math.pow(2, a.length - 1 - i);
        return ret;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,0,1,1],[1,0,1,0],[1,1,0,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[0]]\n
// [[0,1],[1,0]]\n
// [[1,1],[1,1]]\n
// [[0,0],[1,1]]\n
// [[0,0],[0,0]]\n
// @lcpr case=end

 */

