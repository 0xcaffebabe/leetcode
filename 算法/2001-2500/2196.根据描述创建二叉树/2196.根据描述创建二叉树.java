/*
 * @lc app=leetcode.cn id=2196 lang=java
 * @lcpr version=21909
 *
 * [2196] 根据描述创建二叉树
 * 
 * 85/85 cases passed (100 ms)
 * Your runtime beats 17 % of java submissions
 * Your memory usage beats 33 % of java submissions (54 MB)
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

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

    public String toString() {
        return val + "";
    }
}
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> treeMap = new HashMap<>();
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        for(var i : descriptions) {
            treeMap.computeIfAbsent(i[0], k -> new TreeNode(i[0]));
            treeMap.computeIfAbsent(i[1], k -> new TreeNode(i[1]));
            var parent = treeMap.get(i[0]);
            var node = treeMap.get(i[1]);

            if (i[2] == 1) parent.left = node;
            else parent.right = node;
            parentMap.put(node, parent);
        }
        // System.out.println(treeMap.values());
        for(var i : treeMap.values()) {
            if (!parentMap.containsKey(i)) return i;
        }
        return null;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]\n
// [[1,2,1]]
// @lcpr case=end

// @lcpr case=start
// [[1,2,1],[2,3,0],[3,4,1]]\n
// @lcpr case=end

 */

