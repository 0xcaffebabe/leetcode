
/*
 * @lc app=leetcode.cn id=687 lang=java
 *
 * [687] 最长同值路径
 * 
 * 71/71 cases passed (2 ms)
 * Your runtime beats 96.54 % of java submissions
 * Your memory usage beats 10.43 % of java submissions (45.3 MB)
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
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return ans;
    }
    int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int left0 = 0;
        int right0 = 0;
        if (root.left != null && root.left.val == root.val) left0 = left + 1;
        if (root.right != null && root.right.val == root.val) right0 = right + 1;
        ans = Math.max(ans, left0 + right0);
        return Math.max(left0, right0);
    }
}
// @lc code=end

