/*
 * @lc app=leetcode.cn id=1530 lang=java
 * @lcpr version=
 *
 * [1530] 好叶子节点对的数量
 * 
 * 113/113 cases passed (2022 ms)
 * Your runtime beats 5.33 % of java submissions
 * Your memory usage beats 5.33 % of java submissions (49.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

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
    Map<TreeNode, Set<TreeNode>> graph = new HashMap<>();
    List<TreeNode> leafs = new ArrayList<>();
    int distance;
    int ans = 0;
    Set<TreeNode> visited = new HashSet<>();
    public int countPairs(TreeNode root, int distance) {
        this.distance = distance;
        createGraph(root, null);
        for (var i : leafs) {
            dfs(i, 0);
            visited.clear();
        }
        return ans / 2;
    }

    void dfs(TreeNode root, int depth) {
        if (root == null) return;
        if (visited.contains(root)) return;
        if (root.left == null && root.right == null 
            && depth <= distance && depth != 0) ans++;
        visited.add(root);
        // System.out.println(root.val);
        for (TreeNode node : graph.get(root)) {
            dfs(node, depth + 1);
        }
    }

    void createGraph(TreeNode root, TreeNode parent) {
        if (root == null) return;
        if (root.left == null && root.right == null) leafs.add(root);
        graph.computeIfAbsent(root, k -> new HashSet<>());
        if (parent != null) {
            graph.get(root).add(parent);
            graph.computeIfAbsent(parent, k -> new HashSet<>()).add(root);
        }
        createGraph(root.left, root);
        createGraph(root.right, root);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,null,4]\n3\n
// [1,2]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5,6,7]\n3\n
// @lcpr case=end

// @lcpr case=start
// [7,1,4,6,null,5,3,null,null,null,null,null,2]\n3\n
// @lcpr case=end

// @lcpr case=start
// [100]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1]\n2\n
// @lcpr case=end

 */

