/*
 * @lc app=leetcode.cn id=965 lang=java
 *
 * [965] 单值二叉树
 * 
 * 72/72 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 75.23 % of java submissions (38.8 MB)
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
    public boolean isUnivalTree(TreeNode root) {
        this.target = root.val;
        return travel(root);
    }
    boolean travel(TreeNode root) {
        if (root == null) return true;
        if (root.val != target) return false;
        return travel(root.left) && travel(root.right);
    }
}
// @lc code=end

