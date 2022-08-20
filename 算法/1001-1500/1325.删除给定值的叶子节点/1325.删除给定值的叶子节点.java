/*
 * @lc app=leetcode.cn id=1325 lang=java
 *
 * [1325] 删除给定值的叶子节点
 * 
 * 50/50 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 25.33 % of java submissions (41.2 MB)
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
    int target;
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        this.target = target;
        dfs(root.left, root, true);
        dfs(root.right, root, false);
        if (root.left == null && root.right == null && root.val == target) return null;
        return root;
    }
    void dfs(TreeNode root, TreeNode parent, boolean left) {
        if (root == null) return;
        dfs(root.left, root, true);
        dfs(root.right, root, false);
        if (root.left == null && root.right == null && root.val == target) {
            if (parent != null) {
                if (left) parent.left = null;
                else parent.right = null;
            }
        }
    }
}
// @lc code=end

