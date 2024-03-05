/*
 * @lc app=leetcode.cn id=2368 lang=java
 * @lcpr version=
 *
 * [2368] 受限条件下可到达节点的数目
 * 
 * 62/62 cases passed (165 ms)
 * Your runtime beats 5.14 % of java submissions
 * Your memory usage beats 5.03 % of java submissions (130.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

class Solution {
    // Set<Integer> restrictedSet = new HashSet<>();
    boolean[] restrictedSet;
    Map<Integer, Set<Integer>> graph = new HashMap<>();
    // Set<Integer> visited = new HashSet<>();
    boolean visited[];
    int ans = 0;
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        restrictedSet = new boolean[n];
        visited = new boolean[n];
        for(var i : restricted) restrictedSet[i] = true;
        for(var i : edges) {
            graph.computeIfAbsent(i[0], k -> new HashSet<>()).add(i[1]);
            graph.computeIfAbsent(i[1], k -> new HashSet<>()).add(i[0]);
        }
        dfs(0);
        return ans;
    }
    void dfs(int v) {
        if (visited[v]) return;
        if (restrictedSet[v]) return;
        ans++;
        visited[v] = true;
        for(var i : graph.get(v)) {
            dfs(i);
        }
    }

}
// @lc code=end



/*
// @lcpr case=start
// 7\n[[0,1],[1,2],[3,1],[4,0],[0,5],[5,6]]\n[4,5]\n
// @lcpr case=end

// @lcpr case=start
// 7\n[[0,1],[0,2],[0,5],[0,4],[3,2],[6,5]]\n[4,2,1]\n
// @lcpr case=end

 */

