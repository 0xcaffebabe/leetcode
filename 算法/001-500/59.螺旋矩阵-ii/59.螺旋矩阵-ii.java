/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 * 
 * 20/20 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 32.31 % of java submissions (39.6 MB)
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int x = 0;
        int y = 0;
        int p = 1;
        mat[0][0] = p++;
        int dir = 1;
        int rou = 1;
        int e = n * n;
        while(p <= e) {
            
            if (dir == 1) x++;
            if (dir == 2) y++;
            if (dir == 3) x--;
            if (dir == 4) y--;
            
            if (dir == 1 && x < n - 1 && mat[y][x + 1] != 0) dir = 2;
            else if (dir == 1 && x == n - 1) dir = 2;
            else if (dir == 2 && y < n - 1 && mat[y + 1][x] != 0) dir = 3;
            else if (dir == 2 && y == n - 1) dir = 3;
            else if (dir == 3 && x > 0 && mat[y][x - 1] != 0) dir = 4;
            else if (dir == 3 && x == 0) dir = 4;
            else if (dir == 4 && y > 0 && mat[y - 1][x] != 0) dir = 1;
            else if (dir == 4 && y == 0) dir = 1;
            
            mat[y][x] = p++;
            // System.out.println(x + "|" + y);
        }
        return mat;
    }
}
// @lc code=end

