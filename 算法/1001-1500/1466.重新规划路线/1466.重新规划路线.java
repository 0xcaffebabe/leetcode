/*
 * @lc app=leetcode.cn id=1466 lang=java
 * @lcpr version=
 *
 * [1466] 重新规划路线
 * 
 * 76/76 cases passed (157 ms)
 * Your runtime beats 7 % of java submissions
 * Your memory usage beats 5.07 % of java submissions (91.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    Map<Integer, Set<Integer>> nGraph = new HashMap<>();
    Map<Integer, Set<Integer>> rGraph = new HashMap<>();
    // Set<Integer> visted = new HashSet<>();
    boolean[] visted;
    int ans = 0;
    public int minReorder(int n, int[][] connections) {
        this.visted = new boolean[n];
        for(var conn: connections) {
            nGraph.computeIfAbsent(conn[0], k -> new HashSet<>())
                .add(conn[1]);
            rGraph.computeIfAbsent(conn[0], k -> new HashSet<>())
                .add(conn[1]);
            rGraph.computeIfAbsent(conn[1], k -> new HashSet<>())
                .add(conn[0]);
        }
        dfs(0, -1);
        return ans - 1;
    }
    void dfs(int v, int p) {
        // if (visted.contains(v)) return;
        if (visted[v]) return;
        // System.out.println(v);
        // visted.add(v);
        visted[v] = true;
        var r = rGraph.get(v);
        if (!nGraph.containsKey(v) || !nGraph.get(v).contains(p)) ans++;
        for(var i : r) dfs(i, v);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 6\n[[0,1],[1,3],[2,3],[4,0],[4,5]]\n
// @lcpr case=end

// @lcpr case=start
// 5\n[[1,0],[1,2],[3,2],[3,4]]\n
// @lcpr case=end

// @lcpr case=start
// 3\n[[1,0],[2,0]]\n
// 4\n[[0, 1], [1, 2], [2, 3]]\n
// 7\n[[0, 1], [0, 2], [0, 3], [1, 4], [1, 5], [2, 6]]\n
// 8\n[[0, 1], [1, 2], [1, 3], [2, 4], [2, 5], [3, 6], [3, 7]]\n
// 5\n[[4,3],[2,3],[1,2],[1,0]]\n
// @lcpr case=end

 */

