/*
 * @lc app=leetcode.cn id=797 lang=java
 *
 * [797] 所有可能的路径
 * 
 * 30/30 cases passed (2 ms)
 * Your runtime beats 59.3 % of java submissions
 * Your memory usage beats 93.18 % of java submissions (42.9 MB)
 */

// @lc code=start
class Solution {
    int n;
    Map<Integer, Boolean> vis = new HashMap<>();
    List<List<Integer>> ans = new ArrayList<>();
    int[][] graph;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.n = graph.length;
        this.graph = graph;
        dfs(List.of(0), 0);
        return ans;
    }
    void dfs(List<Integer> path, int v) {
        if (path.size() > 0 && path.get(path.size() - 1) == n - 1) {
            ans.add(path);
            return;
        }
        if (graph[v].length == 0) return;

        for(var i: graph[v]) {
            var list = new ArrayList<>(path);
            list.add(i);
            dfs(list, i);
        }
    }
}
// @lc code=end

