/*
 * @lc app=leetcode.cn id=700 lang=java
 *
 * [700] 二叉搜索树中的搜索
 * 
 * 36/36 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 83.21 % of java submissions (41.6 MB)
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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        var l = searchBST(root.left, val);
        var r = searchBST(root.right, val);
        return l != null ? l : r;
    }
}
// @lc code=end

