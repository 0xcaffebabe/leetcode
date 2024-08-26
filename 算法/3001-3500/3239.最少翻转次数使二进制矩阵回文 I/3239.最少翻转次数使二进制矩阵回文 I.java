/*
 * @lc app=leetcode.cn id=3239 lang=java
 * @lcpr version=
 *
 * [3239] 最少翻转次数使二进制矩阵回文 I
 * 
 * 625/625 cases passed (9 ms)
 * Your runtime beats 33.03 % of java submissions
 * Your memory usage beats 21.81 % of java submissions (108.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    int[][] grid;
    public int minFlips(int[][] grid) {
        this.grid = grid;
        int rowsFlip = 0;
        int colsFlip = 0;
        for(int i = 0; i < grid.length; i++)
            rowsFlip += filpRow(i);
        for(int i = 0; i < grid[0].length; i++)
            colsFlip += filpCol(i);
        // System.out.println(rowsFlip + "|" + colsFlip);
        return Math.min(rowsFlip, colsFlip);
    }

    int filpRow(int rowNum) {
        int ans = 0;
        var row = grid[rowNum];
        int n = row.length / 2;
        for(int i = 0; i < n; i++) {
            if (row[i] != row[row.length - i - 1]) ans++;
        }
        return ans;
    }

    int filpCol(int colNum) {
        int ans = 0;
        int n = grid.length / 2;
        for(int i = 0; i < n; i++) {
            if (grid[i][colNum] != grid[grid.length - i - 1][colNum]) ans++;
        }
        return ans;
    }


}
// @lc code=end



/*
// @lcpr case=start
// [[1,0,0],[0,0,0],[0,0,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,1],[0,1],[0,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1],[0]]\n
// @lcpr case=end

 */

