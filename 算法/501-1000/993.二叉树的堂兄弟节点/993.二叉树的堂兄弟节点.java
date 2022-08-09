/*
 * @lc app=leetcode.cn id=993 lang=java
 *
 * [993] 二叉树的堂兄弟节点
 * 
 * 105/105 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 9.46 % of java submissions (39.7 MB)
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
    int x;
    int y;
    int xLevel;
    TreeNode xParent;
    int yLevel;
    TreeNode yParent;
    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        calcLevel(root, 0, null);
        return xLevel == yLevel && xParent != yParent;
    }

    void calcLevel(TreeNode root, int level, TreeNode parent) {
        if (root == null) return;
        if (root.val == x) {
            xLevel = level;
            xParent = parent;
        }
        if (root.val == y) {
            yLevel = level;
            yParent = parent;
        }
        calcLevel(root.left, level + 1, root);
        calcLevel(root.right, level + 1, root);
    }
}
// @lc code=end

