/*
 * @lc app=leetcode.cn id=LCP 07 lang=java
 * @lcpr version=
 *
 * [LCP 07] 传递信息
 * 
 * 28/28 cases passed (3 ms)
 * Your runtime beats 30.52 % of java submissions
 * Your memory usage beats 30.14 % of java submissions (39.3 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    int n;
    Map<Integer, List<Integer>> map = new HashMap<>();
    int k;
    int ans = 0;
    public int numWays(int n, int[][] relation, int k) {
        this.k = k;
        this.n = n;
        for(var i : relation) 
            map.computeIfAbsent(i[0], key -> new ArrayList<>()).add(i[1]);
        // System.out.println(map);
        dfs(0, 0);
        return ans;
    }

    void dfs(int node, int cnt) {
        // System.out.println(node + "|" + cnt);
        if (cnt == k) {
            if (node == n - 1) ans++;
            return;
        }
        map.getOrDefault(node, new ArrayList<>()).forEach(v ->dfs(v, cnt+1));
    }
}
// @lc code=end



/*
// @lcpr case=start
// 5\n[[0,2],[2,1],[3,4],[2,3],[1,4],[2,0],[0,4]]\n3\n
// 5\n[[0,2],[2,1],[3,4],[2,3],[1,0],[2,0],[0,4]]\n3\n
// @lcpr case=end

// @lcpr case=start
// 3\n[[0,2],[2,1]]\n2\n
// 3\n[[0,2],[2,0]]\n2\n
// @lcpr case=end

 */

