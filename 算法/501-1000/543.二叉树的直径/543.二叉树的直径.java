/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
 * 
 * 104/104 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 37.19 % of java submissions (41.2 MB)
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
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        travel(root);
        return ans;
    }
    int travel(TreeNode root) {
        if (root == null) return 0;
        int l = travel(root.left);
        int r = travel(root.right);
        ans = Math.max(ans, l + r);
        return Math.max(l, r) + 1;
    }
}
// @lc code=end

