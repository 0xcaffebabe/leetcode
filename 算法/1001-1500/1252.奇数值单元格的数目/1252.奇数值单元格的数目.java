/*
 * @lc app=leetcode.cn id=1252 lang=java
 * @lcpr version=
 *
 * [1252] 奇数值单元格的数目
 * 
 * 44/44 cases passed (1 ms)
 * Your runtime beats 69.26 % of java submissions
 * Your memory usage beats 28.57 % of java submissions (39.5 MB)
 */

// @lc code=start
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        for(var i : indices) {
            for(int c = 0; c < n; c++)
                mat[i[0]][c]++;
            for(int r = 0; r < m; r++)
                mat[r][i[1]]++;
        }
        int ans = 0;
        for(var i : mat)
            for(var j : i) if (j % 2 != 0) ans++;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n3\n[[0,1],[1,1]]\n
// @lcpr case=end

// @lcpr case=start
// 2\n2\n[[1,1],[0,0]]\n
// @lcpr case=end

 */

