/*
 * @lc app=leetcode.cn id=面试题 04.01 lang=java
 * @lcpr version=
 *
 * [面试题 04.01] 节点间通路
 * 
 * 37/37 cases passed (20 ms)
 * Your runtime beats 56.43 % of java submissions
 * Your memory usage beats 91.43 % of java submissions (74.8 MB)
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
    int target;
    boolean[] visted;
    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        this.target = target;
        visted = new boolean[n];
        for(var i : graph) {
            g.computeIfAbsent(i[0], k -> new ArrayList<>())
                .add(i[1]);
        }
        return dfs(start);
    }

    boolean dfs(int v) {
        if (visted[v]) return false;
        if (v == target) return true;
        visted[v] = true;
        var neg = g.get(v);
        if (neg == null) return false;
        for(var i : neg) {
            if (dfs(i)) return true;
        }
        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n[[0, 1], [0, 2], [1, 2], [1, 2]]\n0\n2\n
// 5\n[[0, 1], [0, 2], [0, 4], [0, 4], [0, 1], [1, 3], [1, 4], [1, 3], [2, 3], [3, 4]]\n0\n4\n
// 3\n[[0, 2], [1, 2]]\n0\n1\n
// 4\n[[0,1],[1,2],[2,1],[2,3]]\n0\n3\n
// @lcpr case=end

 */

