/*
 * @lc app=leetcode.cn id=51 lang=java
 * @lcpr version=
 *
 * [51] N 皇后
 * 
 * 9/9 cases passed (3 ms)
 * Your runtime beats 59.62 % of java submissions
 * Your memory usage beats 90.62 % of java submissions (42.5 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    boolean[] cvis = new boolean[10];
    boolean[] dvis1 = new boolean[40];
    boolean[] dvis2 = new boolean[40];
    int n;
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        bt(0, new ArrayList<>());
        return ans;
    }

    void bt(int row, List<String> list) {
        if (row == n) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int c = 0; c < n; c++) {
            if (cvis[c]) continue;
            int d1 = row + c + 20;
            int d2 = row - c + 20;
            if (dvis1[d1]) continue;
            if (dvis2[d2]) continue;

            cvis[c] = true;
            dvis1[d1] = true;
            dvis2[d2] = true;
            list.add(build(c));
            bt(row + 1, list);
            list.remove(list.size() - 1);
            cvis[c] = false;
            dvis1[d1] = false;
            dvis2[d2] = false;
        }
    }

    String build(int x) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if (x == i) sb.append("Q");
            else sb.append(".");
        }
        return sb.toString();
    }
}
// @lc code=end



/*
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

// @lcpr case=start
// @lcpr case=end

 */

