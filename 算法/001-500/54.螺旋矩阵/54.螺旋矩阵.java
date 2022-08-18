import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 * 
 * 23/23 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 63.21 % of java submissions (39.4 MB)
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        if (n == 1) {
            for(var i : matrix) {
                for(var j : i) ans.add(j);
            }
            return ans;
        }
        int[][] mat = new int[m][n];
        int x = 0;
        int y = 0;
        int dir = 1;
        int cnt = 0;
        int e = m * n;
        while(cnt < e) {
            ans.add(matrix[y][x]);
            mat[y][x] = matrix[y][x];
            
            if (dir == 1) x++;
            if (dir == 2) y++;
            if (dir == 3) x--;
            if (dir == 4) y--;
            
            if (dir == 1 && x < n - 1 && mat[y][x + 1] != 0) dir = 2;
            else if (dir == 1 && x == n - 1) dir = 2;
            else if (dir == 2 && y < m - 1 && mat[y + 1][x] != 0) dir = 3;
            else if (dir == 2 && y == m - 1) dir = 3;
            else if (dir == 3 && x > 0 && mat[y][x - 1] != 0) dir = 4;
            else if (dir == 3 && x == 0) dir = 4;
            else if (dir == 4 && y > 0 && mat[y - 1][x] != 0) dir = 1;
            else if (dir == 4 && y == 0) dir = 1;
            
            cnt++;
            // System.out.println(x + "|" + y);
        }
        return ans;
    }
}
// @lc code=end

