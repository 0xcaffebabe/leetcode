/*
 * @lc app=leetcode.cn id=1337 lang=java
 * @lcpr version=
 *
 * [1337] 矩阵中战斗力最弱的 K 行
 * 
 * 52/52 cases passed (2 ms)
 * Your runtime beats 56.57 % of java submissions
 * Your memory usage beats 56.88 % of java submissions (43.5 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] t = new int[mat.length][2];
        for(int i = 0; i < mat.length; i++)
            for(int j = 0; j < mat[i].length; j++)
                if (mat[i][j] == 1) t[i][0]++;
        for(int i = 0; i < mat.length; i++)
            t[i][1] = i;
        Arrays.sort(t, (a,b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });
        int[] ans = new int[k];
        for(int i = 0; i < k; i++)
            ans[i] = t[i][1];
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,1,0,0,0],[1,1,1,1,0],[1,0,0,0,0],[1,1,0,0,0],[1,1,1,1,1]]\n3\n
// @lcpr case=end

// @lcpr case=start
// [[1,0,0,0],[1,1,1,1],[1,0,0,0],[1,0,0,0]]\n2\n
// @lcpr case=end

 */

