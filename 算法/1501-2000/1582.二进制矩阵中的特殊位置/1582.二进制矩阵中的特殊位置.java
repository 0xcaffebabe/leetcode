import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=1582 lang=java
 *
 * [1582] 二进制矩阵中的特殊位置
 * 
 * 95/95 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 28.45 % of java submissions (41.8 MB)
 */

// @lc code=start
class Solution {
    public int numSpecial(int[][] mat) {
        int[] rows = new int[mat.length];
        int[] cols = new int[mat[0].length];

        for(int i = 0; i < mat.length; i++) {
            int sum = 0;
            for(int j = 0; j < mat[i].length; j++) sum += mat[i][j];
            rows[i] = sum;
        }

        for(int j = 0; j < mat[0].length; j++) {
            int sum = 0;
            for(int i= 0; i < mat.length; i++) sum += mat[i][j];
            cols[j] = sum;
        }

        int ans = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1 && rows[i] == 1 && cols[j] == 1) ans++;
            }
        }
        return ans;
    }
}
// @lc code=end

