/*
 * @lc app=leetcode.cn id=606 lang=java
 *
 * [606] 根据二叉树创建字符串
 * 
 * 160/160 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 86.97 % of java submissions (41 MB)
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
    StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode root) {
        travel(root);
        return sb.substring(1, sb.length() - 1).toString();
    }
    void travel(TreeNode root) {
        if (root == null) return;
        sb.append("(");
        sb.append(root.val);
        if (root.left != null) {
            travel(root.left);
            travel(root.right);
        }
        if (root.left == null && root.right != null) {
            sb.append("()");
            travel(root.right);
        }
        sb.append(")");
    }
}
// @lc code=end

