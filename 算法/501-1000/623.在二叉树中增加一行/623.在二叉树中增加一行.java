/*
 * @lc app=leetcode.cn id=623 lang=java
 *
 * [623] 在二叉树中增加一行
 * 
 * 109/109 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 19.16 % of java submissions (41.3 MB)
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
    int depth;
    int val;
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        this.depth = depth;
        this.val = val;
        return dfs(root, 0, false);
    }
    TreeNode dfs(TreeNode root, int level, boolean left) {
        if (root == null && level != depth - 1) return null;
        if (level == depth - 1) {
            if (depth - 1 == 0) return new TreeNode(val, root, null);
            if (left) return new TreeNode(val, root, null);
            else return new TreeNode(val, null, root);
        }else {
            root.left = dfs(root.left, level + 1, true);
            root.right = dfs(root.right, level + 1, false);
        }
        return root;
    }
}
// @lc code=end

