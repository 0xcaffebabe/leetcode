/*
 * @lc app=leetcode.cn id=2316 lang=java
 * @lcpr version=
 *
 * [2316] 统计无向图中无法互相到达点对数
 * 
 * 66/66 cases passed (98 ms)
 * Your runtime beats 7.58 % of java submissions
 * Your memory usage beats 13.64 % of java submissions (114.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    Map<Integer, List<Integer>> g = new HashMap<>();
    boolean[] vis;
    public long countPairs(int n, int[][] edges) {
        vis = new boolean[n];
        for(int i = 0; i < n; i++) {
            g.computeIfAbsent(i, v -> new ArrayList<>());
        }
        
        for(var e: edges) {
            g.get(e[0]).add(e[1]);
            g.get(e[1]).add(e[0]);
        }
        List<Integer> comps = new ArrayList<>();
        for(var enr: g.entrySet()) {
            var arr = new int[1];
            dfs(enr.getKey(), arr);
            if (arr[0] != 0) comps.add(arr[0]);
        }
        // System.out.println(comps);
        long ans =  (1L * n * (n - 1)) / 2;
        for(int i = 0; i < comps.size(); i++) {
            int c = comps.get(i);
            ans -= (1L * c * (c - 1)) / 2;
        }
        return ans;
    }

    void dfs(int v, int[] sum) {
        if (vis[v]) return;
        var neighbour = g.get(v);
        sum[0] += 1;
        vis[v] = true;
        if (neighbour == null) return;
        for(var n: neighbour) dfs(n, sum);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n[[0,1],[0,2],[1,2]]\n
// 100000\n[]\n
// 100000\n[[1,2],[2,3]]\n
// @lcpr case=end

// @lcpr case=start
// 7\n[[0,2],[0,5],[2,4],[1,6],[5,4]]\n
// @lcpr case=end

 */

