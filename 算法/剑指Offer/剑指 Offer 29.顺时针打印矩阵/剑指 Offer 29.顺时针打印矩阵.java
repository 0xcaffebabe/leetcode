/*
 * @lc app=leetcode.cn id=剑指 Offer 29 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer 29] 顺时针打印矩阵
 * 
 * 27/27 cases passed (3 ms)
 * Your runtime beats 19.36 % of java submissions
 * Your memory usage beats 73.38 % of java submissions (43.2 MB)
 */

// @lc code=start
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) return new int[]{};
        int n = matrix[0].length;
        if (n == 0) return new int[]{};
        int[] ans = new int[m * n];

        if (n == 1) {
            int cnt = 0;
            for(var i : matrix) {
                for(var j : i) ans[cnt++] = j;
            }
            return ans;
        }
        boolean[][] mat = new boolean[m][n];
        int x = 0;
        int y = 0;
        int dir = 1;
        int cnt = 0;
        int e = m * n;
        while(cnt < e) {
            ans[cnt] = matrix[y][x];
            mat[y][x] = true;
            
            if (dir == 1) x++;
            if (dir == 2) y++;
            if (dir == 3) x--;
            if (dir == 4) y--;
            
            if (dir == 1 && x < n - 1 && mat[y][x + 1]) dir = 2;
            else if (dir == 1 && x == n - 1) dir = 2;
            else if (dir == 2 && y < m - 1 && mat[y + 1][x]) dir = 3;
            else if (dir == 2 && y == m - 1) dir = 3;
            else if (dir == 3 && x > 0 && mat[y][x - 1]) dir = 4;
            else if (dir == 3 && x == 0) dir = 4;
            else if (dir == 4 && y > 0 && mat[y - 1][x]) dir = 1;
            else if (dir == 4 && y == 0) dir = 1;
            
            cnt++;
            // System.out.println(x + "|" + y);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2,3],[4,5,6],[7,8,9]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,2,3,4],[5,6,7,8],[9,10,11,12]]\n
// @lcpr case=end

// @lcpr case=start
// [[]]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

 */

