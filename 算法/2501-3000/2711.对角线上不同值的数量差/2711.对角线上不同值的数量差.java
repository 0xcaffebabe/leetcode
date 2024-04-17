/*
 * @lc app=leetcode.cn id=2711 lang=java
 * @lcpr version=
 *
 * [2711] 对角线上不同值的数量差
 * 
 * 709/709 cases passed (25 ms)
 * Your runtime beats 24.24 % of java submissions
 * Your memory usage beats 66.67 % of java submissions (44.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                Set<Integer> topLeft = new HashSet<>();
                Set<Integer> bottomRight = new HashSet<>();
                int r = i - 1; int c = j - 1;
                while(r >= 0 && c >= 0) {
                    topLeft.add(grid[r][c]);
                    r--;c--;
                }
                r = i + 1; c = j + 1;
                while(r < m && c < n) {
                    bottomRight.add(grid[r][c]);
                    r++;c++;
                }

                ans[i][j] = Math.abs(topLeft.size() - bottomRight.size());
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2,3],[3,1,5],[3,2,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[1]]\n
// [[1,2]]\n
// [[1,2],[3,2]]\n
// [[1,2],[3,2],[2,2]]\n
// [[1],[3],[2]]\n
// @lcpr case=end

 */

