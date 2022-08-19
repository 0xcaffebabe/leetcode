/*
 * @lc app=leetcode.cn id=450 lang=java
 *
 * [450] 删除二叉搜索树中的节点
 * 
 * 92/92 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 96.71 % of java submissions (41.4 MB)
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
    int key;
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key) {
            if (root.left == null && root.right == null) return null;
            else if (root.left == null && root.right != null) return root.right;
            else if (root.left != null && root.right == null) return root.left;
            var successor = root.right;
            while(successor.left != null) successor = successor.left;
            successor.left = root.left;
            root = root.right;
        }else {
            root.left = deleteNode(root.left, key);
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
}
// @lc code=end

