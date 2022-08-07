/*
 * @lc app=leetcode.cn id=783 lang=java
 *
 * [783] 二叉搜索树节点最小距离
 * 
 * 48/48 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 90.25 % of java submissions (38.8 MB)
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
    int min = Integer.MAX_VALUE; 
    int prev = -1;
    public int minDiffInBST(TreeNode root) {
        travel(root);
        return min;
    }
    void travel(TreeNode root) {
        if (root == null) return;
        travel(root.left);
        if (prev == -1) prev = root.val;
        else {
            min = Math.min(min, root.val - prev);
            prev = root.val;
        }
        travel(root.right);
    }
}
// @lc code=end

