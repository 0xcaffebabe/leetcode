/*
 * @lc app=leetcode.cn id=998 lang=java
 *
 * [998] 最大二叉树 II
 * 
 * 75/75 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 6.4 % of java submissions (39.9 MB)
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
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        // 当前节点的值小于目标值 则当前节点转为目标值节点的左孩子
        // 另外以一种情况是目标值是最小的，此时创建一个节点，作为其父节点的右孩子
        if (root == null || val > root.val) {
            var ori = root;
            root = new TreeNode(val);
            root.left = ori;
            return root;
        }
        
        root.right = insertIntoMaxTree(root.right, val);
        return root;
    }
}
// @lc code=end

