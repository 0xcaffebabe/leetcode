/*
 * @lc app=leetcode.cn id=563 lang=java
 *
 * [563] 二叉树的坡度
 * 
 * 77/77 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 71.94 % of java submissions (41.2 MB)
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
    private int ans = 0;
    public int findTilt(TreeNode root) {
        travel(root);
        return ans;
    }
    int travel(TreeNode root) {
        if (root == null) return 0;
        int l = travel(root.left);
        int r = travel(root.right);
        ans += Math.abs(l - r);
        return root.val + l + r;
    }
}
// @lc code=end

