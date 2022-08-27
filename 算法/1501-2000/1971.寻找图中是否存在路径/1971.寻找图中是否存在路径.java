import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1971 lang=java
 *
 * [1971] 寻找图中是否存在路径
 * 
 * 26/26 cases passed (223 ms)
 * Your runtime beats 5.02 % of java submissions
 * Your memory usage beats 5.03 % of java submissions (162.6 MB)
 */

// @lc code=start
class Solution {
    // 领接表
    Map<Integer, List<Integer>> map = new HashMap<>();
    boolean ans = false;
    int dest;
    boolean[] visted;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;
        this.dest = destination;
        visted = new boolean[n];
        for(var edge: edges) {
            map.computeIfAbsent(edge[0], key -> new ArrayList<>());
            map.computeIfAbsent(edge[1], key -> new ArrayList<>());
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        dfs(source);
        return ans;
    }
    void dfs(int v) {
        if (ans) return;
        if (visted[v]) return;
        visted[v] = true;
        for(var edge: map.get(v)) {
            if (visted[edge]) continue;
            // System.out.println(v);
            if (edge == dest) {
                ans = true;
                return;
            }
            dfs(edge);
        }
    }
}
// @lc code=end

