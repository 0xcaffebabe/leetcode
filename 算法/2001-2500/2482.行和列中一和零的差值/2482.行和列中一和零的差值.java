/*
 * @lc app=leetcode.cn id=2482 lang=java
 * @lcpr version=
 *
 * [2482] 行和列中一和零的差值
 * 
 * 85/85 cases passed (11 ms)
 * Your runtime beats 51.18 % of java submissions
 * Your memory usage beats 92.35 % of java submissions (69.2 MB)
 */

// @lc code=start
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] oneRowCnt = new int[m];
        int[] zeroRowCnt = new int[m];
        int[] oneColCnt = new int[n];
        int[] zeroColCnt = new int[n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) { 
                if (grid[i][j] == 0) {
                    zeroRowCnt[i]++;
                    zeroColCnt[j]++;
                } else {
                    oneRowCnt[i]++;
                    oneColCnt[j]++;
                }
            }
        }

        int[][] diff = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) { 
                diff[i][j] = oneRowCnt[i] + oneColCnt[j]
                    - zeroRowCnt[i] - zeroColCnt[j];
            }
        }
        return diff;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,1,1],[1,0,1],[0,0,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1,1],[1,1,1]]\n
// [[1],[1]]\n
// [[0],[1]]\n
// [[0],[0]]\n
// @lcpr case=end

 */

