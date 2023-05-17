/*
 * @lc app=leetcode.cn id=2385 lang=java
 * @lcpr version=21907
 *
 * [2385] 感染二叉树需要的总时间
 * 
 * 80/80 cases passed (301 ms)
 * Your runtime beats 6 % of java submissions
 * Your memory usage beats 5.33 % of java submissions (130.8 MB)
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    int ans = 0;
    Map<TreeNode, Set<TreeNode>> graph = new HashMap<>();
    TreeNode target = null;
    int start;
    Set<TreeNode> visited = new HashSet<>();
    public int amountOfTime(TreeNode root, int start) {
        this.start = start;
        dfs(root);
        // System.out.println(target);
        bfs(target, 0);
        return ans;
    }
    void dfs(TreeNode root) {
        if (root == null) return;
        if (root.val == start) target = root;
        graph.computeIfAbsent(root, k -> new HashSet<>());
        if (root.left != null) {
            graph.get(root).add(root.left);
            graph.computeIfAbsent(root.left, k -> new HashSet<>());
            graph.get(root.left).add(root);
        }
        if (root.right != null) {
            graph.get(root).add(root.right);
            graph.computeIfAbsent(root.right, k -> new HashSet<>());
            graph.get(root.right).add(root);
        }
        dfs(root.left);
        dfs(root.right);
    }
    void bfs(TreeNode root, int level) {
        if (root == null) return;
        if (visited.contains(root)) return;

        ans = Math.max(ans, level);
        var links = graph.get(root);
        if (links == null) return;

        visited.add(root);
        for(var i : links) {
            bfs(i, level + 1);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,5,3,null,4,10,6,9,2]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,5,3,null,4,10,6,9,2]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,5,3,null,4,10,6,9,2]\n1\n
// @lcpr case=end

 */

