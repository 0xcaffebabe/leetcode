/*
 * @lc app=leetcode.cn id=剑指 Offer II 118 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 118] 多余的边
 * 
 * 39/39 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 95.83 % of java submissions (41.1 MB)
 */

// @lc code=start
class Solution {
    int[] parent;
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n + 1];
        for(int i = 1; i <= n; i++) parent[i] = i;
        for(var edge: edges) {
            // 不相连
            if (find(edge[0]) != find(edge[1])) union(edge[0], edge[1]);
            else return edge;
        }
        return null;
    }

    void union(int index1, int index2) {
        parent[find(index1)] = parent[find(index2)];
    }

    int find(int index) {
        if (parent[index] != index) {
            parent[index] = find(parent[index]);
        }
        return parent[index];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2],[1,3],[2,3]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,2],[2,3],[3,4],[1,4],[1,5]]\n
// @lcpr case=end

 */

