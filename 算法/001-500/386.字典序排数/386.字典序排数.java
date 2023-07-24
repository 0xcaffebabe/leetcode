/*
 * @lc app=leetcode.cn id=386 lang=java
 * @lcpr version=21912
 *
 * [386] 字典序排数
 * 
 * 26/26 cases passed (5 ms)
 * Your runtime beats 30.64 % of java submissions
 * Your memory usage beats 60.34 % of java submissions (46 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> ans = new ArrayList<>();
    int n;
    public List<Integer> lexicalOrder(int n) {
        this.n = n;
        for(int i = 1; i <= 9; i++) dfs(i);
        return ans;
    }

    void dfs(int t) {
        if (t > n) return;
        ans.add(t);
        for(int i = 0; i <= 9; i++) dfs(t * 10 + i);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 13\n
// 50000\n
// @lcpr case=end

// @lcpr case=start
// 2\n
// @lcpr case=end

 */

