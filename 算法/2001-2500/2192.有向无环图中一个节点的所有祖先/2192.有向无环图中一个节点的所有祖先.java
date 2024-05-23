/*
 * @lc app=leetcode.cn id=2192 lang=java
 * @lcpr version=
 *
 * [2192] 有向无环图中一个节点的所有祖先
 * 
 * 80/80 cases passed (67 ms)
 * Your runtime beats 81.03 % of java submissions
 * Your memory usage beats 96.75 % of java submissions (54.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    Map<Integer, List<Integer>> rgraph = new HashMap<>();
    boolean[] visted;
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        visted = new boolean[n];
        for(int i = 0; i < n; i++) ans.add(new ArrayList<>());
        for(var i : edges)
            rgraph.computeIfAbsent(i[1], k -> new ArrayList<>()).add(i[0]);
        for(int i = 0; i < n; i++) {
            getAncestors(i);
        }
        for(var i: ans) i.sort(Integer::compare);
        return ans;
    }

    List<Integer> getAncestors(int v) {
        if (visted[v]) return ans.get(v);
        List<Integer> ancestors = new ArrayList<>();
        var parents = rgraph.get(v);
        if (parents == null) {
            ans.set(v, ancestors);
            return ancestors;
        }
        ancestors.addAll(parents);
        for(var p: parents) {
            ancestors.addAll(getAncestors(p));
        }
        ans.set(v, new ArrayList<>(new HashSet<>(ancestors)));
        visted[v] = true;
        return ancestors;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 8\n[[0,3],[0,4],[1,3],[2,4],[2,7],[3,5],[3,6],[3,7],[4,6]]\n
// 2\n[[0,1]]\n
// @lcpr case=end

// @lcpr case=start
// 5\n[[0,1],[0,2],[0,3],[0,4],[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]\n
// @lcpr case=end

 */

