/*
 * @lc app=leetcode.cn id=1022 lang=java
 *
 * [1022] 从根到叶的二进制数之和
 * 
 * 63/63 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 18.32 % of java submissions (41.1 MB)
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
    public int sumRootToLeaf(TreeNode root) {
        travel(root, 0);
        return ans;
    }
    void travel(TreeNode root, int prev) {
        if (root == null) return;
        prev = prev * 2 + root.val;
        if (root.left == null && root.right == null) {
            ans += prev;
            return;
        }
        travel(root.left, prev);
        travel(root.right, prev);
    }
}
// @lc code=end

