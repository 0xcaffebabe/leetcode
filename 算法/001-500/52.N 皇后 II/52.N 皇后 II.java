/*
 * @lc app=leetcode.cn id=52 lang=java
 * @lcpr version=
 *
 * [52] N 皇后 II
 * 
 * 9/9 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 68.49 % of java submissions (38.1 MB)
 */

// @lc code=start
class Solution {
    boolean[] cvis = new boolean[10];
    boolean[] dvis1 = new boolean[40];
    boolean[] dvis2 = new boolean[40];
    int n;
    public int totalNQueens(int n) {
        this.n = n;
        return bt(0);
    }

    int bt(int row) {
        if (row == n) return 1;
        int count = 0;
        for(int c = 0; c < n; c++) {
            if (cvis[c]) continue;
            int d1 = row + c + 20;
            int d2 = row - c + 20;
            if (dvis1[d1]) continue;
            if (dvis2[d2]) continue;

            cvis[c] = true;
            dvis1[d1] = true;
            dvis2[d2] = true;

            count += bt(row + 1);
            cvis[c] = false;
            dvis1[d1] = false;
            dvis2[d2] = false;
        }
        return count;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// 2\n
// 3\n
// 4\n
// 5\n
// 6\n
// 7\n
// 8\n
// 9\n
// @lcpr case=end

 */

