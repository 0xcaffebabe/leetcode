/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根节点到叶节点数字之和
 * 
 * 108/108 cases passed (7 ms)
 * Your runtime beats 5.43 % of java submissions
 * Your memory usage beats 5.05 % of java submissions (39.7 MB)
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
    public int sumNumbers(TreeNode root) {
        travel(root, "");
        return ans;
    }

    private void travel(TreeNode root, String s) {
        if (root == null) return;
        s += root.val;
        if (root.left == null && root.right == null) {
            ans += Integer.parseInt(s);
            return;
        }
        travel(root.left, s);
        travel(root.right, s);
    }
}
// @lc code=end

