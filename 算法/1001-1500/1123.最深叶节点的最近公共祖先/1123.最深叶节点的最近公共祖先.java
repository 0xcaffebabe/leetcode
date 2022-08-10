/*
 * @lc app=leetcode.cn id=1123 lang=java
 *
 * [1123] 最深叶节点的最近公共祖先
 * 
 * 81/81 cases passed (2 ms)
 * Your runtime beats 19.28 % of java submissions
 * Your memory usage beats 41.39 % of java submissions (41.2 MB)
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int deepestLevel = 0;
    TreeNode deepestParent;
    List<TreeNode> deepestList = new ArrayList<>();
    Map<TreeNode, TreeNode> parentMap = new HashMap<>();

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        travel(root, 0, null);
        if (deepestParent == null) return root;
        if (deepestList.size() == 1) return deepestList.get(0);

        return findCommonParent(deepestList);
    }
    TreeNode findCommonParent(List<TreeNode> nodeList) {
        HashSet<TreeNode> set = new HashSet<>();
        TreeNode parent = null;
        for(var node : nodeList) {
            parent = parentMap.get(node);
            set.add(parent);
        }
        
        if (set.size() == 1) return parent;
        return findCommonParent(new ArrayList<>(set));
    }

    void travel(TreeNode root, int level, TreeNode parent) {
        if (root == null) return;
        parentMap.put(root, parent);
        if (level == deepestLevel) deepestList.add(root);
        
        if (level > deepestLevel) {
            deepestList = new ArrayList<>(List.of(root));
            deepestLevel = level;
            deepestParent = parent;
        }
        travel(root.left, level + 1, root);
        travel(root.right, level + 1, root);
    }
}
// @lc code=end

