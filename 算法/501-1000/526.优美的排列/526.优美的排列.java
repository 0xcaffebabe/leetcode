/*
 * @lc app=leetcode.cn id=526 lang=java
 * @lcpr version=
 *
 * [526] 优美的排列
 * 
 * 15/15 cases passed (44 ms)
 * Your runtime beats 64.23 % of java submissions
 * Your memory usage beats 23.78 % of java submissions (43.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer>[] match;
    boolean[] vis;
    int ans = 0;
    int n;
    public int countArrangement(int n) {
        match = new List[n + 1];;
        vis = new boolean[n + 1];
        this.n = n;
        for(int i = 1; i <= n; i++) match[i] = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++)
                if (i % j == 0 || j % i == 0) match[i].add(j);
        }
        bt(1);
        return ans;
    }

    void bt(int index) {
        if (index == n + 1) {
            ans++;
            return;
        }
        for(var x: match[index]) {
            if (!vis[x]) {
                vis[x] = true;
                bt(index + 1);
                vis[x] = false;
            }
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n
// 3\n
// 4\n
// 5\n
// 6\n
// 7\n
// 8\n
// 9\n
// 10\n
// 11\n
// 12\n
// 13\n
// 14\n
// 15\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// @lcpr case=end

 */

