/*
 * @lc app=leetcode.cn id=剑指 Offer II 110 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 110] 所有路径
 * 
 * 30/30 cases passed (4 ms)
 * Your runtime beats 8.5 % of java submissions
 * Your memory usage beats 41.86 % of java submissions (44.1 MB)
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



/*
// @lcpr case=start
// [[1,2],[3],[3],[]]\n
// @lcpr case=end

// @lcpr case=start
// [[4,3,1],[3,2,4],[3],[4],[]]\n
// @lcpr case=end

// @lcpr case=start
// [[1],[]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,2,3],[2],[3],[]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,3],[2],[3],[]]\n
// @lcpr case=end

 */

